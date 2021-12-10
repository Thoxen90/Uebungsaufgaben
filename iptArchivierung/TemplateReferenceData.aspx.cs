using System;
using myfactory.Sys.Data;
using myfactory.FrontendSystem.AspTools;
using myfactory.Sys.Tools;
using System.Text;


namespace ASP.Addon.iptArchivierung
{
    public partial class TemplateReferenceData : myfactory.FrontendSystem.AspSystem.ListViewDataPage
    {
        public override bool bFillListView(ClientInfo oClientInfo, AspListView oListView)
        {

            oListView.bPageNavigation = true;
            oListView.sListViewDataPage = "TemplateReferenceData.aspx";

            AspListViewCol oCol;

            oListView.oCols.oAddCol("OrderTypeID", "OrderTypeID", "80", lAlign: wfEnumAligns.wfAlignLeft, bOrder: true, bFilter: true);
            oListView.oCols.oAddCol("TemplateID", "TemplateID", "80", lAlign: wfEnumAligns.wfAlignLeft, bOrder: true, bFilter: true);
            oListView.oCols.oAddCol("Entity", "Entity", "80", lAlign: wfEnumAligns.wfAlignLeft, bOrder: true, bFilter: true);
            oCol = oListView.oCols.oAddCol("Löschen", "Löschen", "80", lAlign: wfEnumAligns.wfAlignRight);
            oCol.lType = wfEnumAspListViewColTypes.wfColTypeButton;

            oListView.sSettingName = "ReferenceDataSettings";

            if (oListView.sOrderCol.bIsNotNullOrEmpty())
            {
                oListView.sOrderCol = "Entity";
            }


            string sOrder = oListView.sOrderCol;

            if (sOrder.bIsNotNullOrEmpty() && oListView.lOrderType == wfEnumAspListViewOrderTypes.wfOrderTypeDesc)
            {
                sOrder = sOrder + " DESC";
            }




            string sClause = "OrderTypeID>0";

            foreach (AspListViewFilter oFilter in oListView.oFilters)
            {
                switch (oFilter.sID)
                {
                    case "OrderTypeID":
                        sClause = sClause.gsClauseAnd(oFilter.sClause("OrderTypeID"));
                        break;
                    case "TemplateID":
                        sClause = sClause.gsClauseAnd(oFilter.sClause("TemplateID"));
                        break;
                    case "Entity":
                        sClause = sClause.gsClauseAnd(oFilter.sClause("Entity"));
                        break;
                    default:
                        sClause = sClause.gsClauseAnd(oFilter.sClause());
                        break;
                }
            }

            string sFields = "OrderTypeID," + "TemplateID," + "Entity";
            string sTables = "IPTArchivierungsConfig";

            Recordset rs = DataMethods.grsGetDBRecordset(oClientInfo, sFields, sTables, sClause, "", sOrder);


            while (!rs.EOF)
            {
                string sRecordID = rs["OrderTypeID"].lValue + "_" + rs["TemplateID"].lValue + "_" + rs["Entity"].sValue;
                oClientInfo.LogSysEvent(sRecordID);

                AspListViewRow oRow = oListView.oRows.oAddRow(sRecordID);
                oRow.SetRecord(rs, false);

                QueryParams oQP = new QueryParams();
                oQP.AddParamInt("OrderTypeID", rs["OrderTypeID"].lValue);
                oQP.AddParamInt("TemplateID", rs["TemplateID"].lValue);
                oQP.AddParamString("Entity", rs["Entity"].sValue);



                oRow.set_Value(0, DataMethods.gsGetDBValuePQ(oClientInfo, "OrderTypeID", sTables, "OrderTypeID=@OrderTypeID", oQP));
                oRow.set_Value(1, DataMethods.gsGetDBValuePQ(oClientInfo, "TemplateID", sTables, "TemplateID=@TemplateID", oQP));
                oRow.set_Value(2, DataMethods.gsGetDBValuePQ(oClientInfo, "Entity", sTables, "Entity=@Entity", oQP));
                oRow.set_Value(3, "x");


                rs.MoveNext();

            }

            oListView.lRecordCountTotal = DataMethods.glGetDBCount(oClientInfo, sTables, sClause);

            return true;
        }
    }
}
