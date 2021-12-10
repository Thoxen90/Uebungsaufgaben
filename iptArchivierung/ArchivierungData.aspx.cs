using System;
using myfactory.Sys.Data;
using myfactory.FrontendSystem.AspTools;
using myfactory.Sys.Tools;
using System.Text;


namespace ASP.Addon.iptArchivierung
{
    public partial class ArchivierungData : myfactory.FrontendSystem.AspSystem.ListViewDataPage
    {
        public override bool bFillListView(ClientInfo oClientInfo, AspListView oListView)
        {

            oListView.bPageNavigation = true;
            oListView.sListViewDataPage = "ArchivierungData.aspx";

            AspListViewCol oCol;

            //oListView.oCols.oAddCol("TemplateID", "TemplateID", "70", lAlign: wfEnumAligns.wfAlignLeft, bOrder: true, bFilter: true);
            oListView.oCols.oAddCol("TemplateName", "TemplateName", "120", lAlign: wfEnumAligns.wfAlignLeft, bOrder: true, bFilter: true);
            oListView.oCols.oAddCol("TemplateView", "TemplateView", "240", lAlign: wfEnumAligns.wfAlignLeft, bOrder: true, bFilter: true);
            oListView.oCols.oAddCol("TemplateText", "TemplateText", "*", lAlign: wfEnumAligns.wfAlignLeft);
            oListView.oCols.oAddCol("SystemReference", "SystemReference", "70", lAlign: wfEnumAligns.wfAlignRight);
            oCol = oListView.oCols.oAddCol("Löschen", "Löschen", "80", lAlign: wfEnumAligns.wfAlignRight);
            oCol.lType = wfEnumAspListViewColTypes.wfColTypeButton;

            oListView.sSettingName = "ArchivierungDataSettings";

            if (oListView.sOrderCol.bIsNotNullOrEmpty())
            {
                oListView.sOrderCol = "TemplateName";
            }


            string sOrder = oListView.sOrderCol;

            if (sOrder.bIsNotNullOrEmpty() && oListView.lOrderType == wfEnumAspListViewOrderTypes.wfOrderTypeDesc)
            {
                sOrder = sOrder + " DESC";
            }




            string sClause = "TemplateID>0";

            foreach (AspListViewFilter oFilter in oListView.oFilters)
            {
                switch (oFilter.sID)
                {
                    case "TemplateID":
                        sClause = sClause.gsClauseAnd(oFilter.sClause("TemplateID"));
                        break;
                    case "TemplateName":
                        sClause = sClause.gsClauseAnd(oFilter.sClause("TemplateName"));
                        break;
                    case "TemplateView":
                        sClause = sClause.gsClauseAnd(oFilter.sClause("TemplateView"));
                        break;
                    case "SystemReference":
                        sClause = sClause.gsClauseAnd(oFilter.sClause("SystemReference"));
                        break;
                    default:
                        sClause = sClause.gsClauseAnd(oFilter.sClause());
                        break;
                }
            }

            string sFields ="TemplateID,"+"TemplateName,"+"TemplateView,"+"TemplateText,"+"SystemReference";
            string sTables = "IPTArchivierungsTemplates";

            Recordset rs = DataMethods.grsGetDBRecordset(oClientInfo, sFields, sTables,sClause,"",sOrder);

            while (!rs.EOF)
            {
                string sRecordID = rs["TemplateID"].sValue + "_" + rs["TemplateName"].sValue + "_" + rs["TemplateView"].sValue + "_"+rs["SystemReference"].lValue;
                string sTemplateText = rs["TemplateText"].sValue;


                AspListViewRow oRow = oListView.oRows.oAddRow(sRecordID);
                oRow.SetRecord(rs, false);

                QueryParams oQP = new QueryParams();
                oQP.AddParamInt("TemplateID", rs["TemplateID"].lValue);
                oQP.AddParamString("TemplateName", rs["TemplateName"].sValue);
                oQP.AddParamString("TemplateView", rs["TemplateView"].sValue);
                oQP.AddParamString("TemplateText", sTemplateText);
                oQP.AddParamInt("SystemReference", rs["SystemReference"].lValue);

                //oRow.set_Value(1, DataMethods.gsGetDBValuePQ(oClientInfo, "TemplateID", sTables, "TemplateID=@TemplateID", oQP));
                oRow.set_Value(0, DataMethods.gsGetDBValuePQ(oClientInfo, "TemplateName", sTables, "TemplateName=@TemplateName", oQP));
                oRow.set_Value(1, DataMethods.gsGetDBValuePQ(oClientInfo, "TemplateView", sTables, "TemplateView=@TemplateView", oQP));
                oRow.set_Value(2, DataMethods.gsGetDBValuePQ(oClientInfo, "TemplateText", sTables, "TemplateText=@TemplateText", oQP));
                oRow.set_Value(3, DataMethods.gsGetDBValuePQ(oClientInfo, "SystemReference", sTables, "SystemReference=@SystemReference", oQP));
                oRow.set_Value(4, "x");

                

                rs.MoveNext();

            }
            oListView.lRecordCountTotal = DataMethods.glGetDBCount(oClientInfo, sTables, sClause);
            return true;
        }
    }
}
