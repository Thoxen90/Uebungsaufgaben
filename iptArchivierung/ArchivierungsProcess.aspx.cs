using System;
using myfactory.Sys.Data;
using myfactory.Sys.Main;
using myfactory.Sys.Tools;
using myfactory.FrontendSystem.AspTools;
using myfactory.FrontendSystem.AspSystem;

namespace ASP.Addon.iptArchivierung
{
    public partial class ArchivierungsProcess : myfactory.FrontendSystem.AspSystem.ProcessPage
    {
        public override string sResponseText(ClientInfo oClientInfo, string sClientID, ref wfEnumContentTypes lContentType)
        {            
            string sMethod = Request.QueryString["Method"];
            string sTemplateName = "";
            string sTemplateView = "";
            string sTemplateText = "";
            string sFields = "TemplateID,TemplateName,TemplateView,TemplateText,SystemReference";
            string sTables = "IPTArchivierungsTemplates";
            string sItemID = Request.QueryString["sItemID"];

            string[] arItemID = new string[8];
            
          
            int lTemplateID = 0, lSystemReference = 0;

            switch (sMethod)
            {
                case "Create":
                    //lTemplateID = Convert.ToInt32(Request.QueryString["TemplateID"]);
                    sTemplateName = Request.QueryString["TemplateName"];
                    sTemplateView = Request.QueryString["TemplateView"];
                    sTemplateText = ClientValues.gsGetClientValue(oClientInfo, "iptTemplateText");

                    sTemplateView = sTemplateView.Replace('\"', '\'');
                    sTemplateName = sTemplateName.Replace('\"', '\'');

                    lSystemReference = Convert.ToInt32(Request.QueryString["SystemReference"]);

                    //oClientInfo.LogSysEvent("Erfolgreich Methode getriggered");

                    if (!DataMethods.gbDBExists(oClientInfo, "TemplateName", "IPTArchivierungsTemplates", "TemplateName=" + sTemplateName)) 
                    {
                        string sInsertCommand = "insert into IPTArchivierungsTemplates values('" + sTemplateName + "','" + sTemplateView + "','" + sTemplateText + "'," + lSystemReference + ");";
                        oClientInfo.LogSysEvent("Test EIngabe: " + "insert into IPTArchivierungsTemplates values(" + sTemplateName + ", " + sTemplateView + ",'" + sTemplateText + "', " + lSystemReference + ");");
                        DataMethods2.glDBExecute(oClientInfo, "insert into IPTArchivierungsTemplates values(" + sTemplateName + "," + sTemplateView + ",'" + sTemplateText + "'," + lSystemReference + ");");

                        return "Erfolgreich erstellt!";
                    }
                    else
                    {
                        
                        string sUpdateCommand = "TemplateView=" + sTemplateView + ",TemplateText='" + sTemplateText + "',SystemReference=" + lSystemReference;
                        DataMethods2.glDBUpdate(oClientInfo, "IPTArchivierungsTemplates", sUpdateCommand, "TemplateName=" + sTemplateName );

                        return "Erfolgreich geupdated!";
                    }
                    

                case "GetDLGParams":
                    arItemID = sItemID.Split('_');
                    Recordset rs = DataMethods.grsGetDBRecordset(oClientInfo, sFields, sTables, "TemplateID=" + arItemID[0]);
                    while (!rs.EOF)
                    {
                        lTemplateID = rs["TemplateID"].lValue; sTemplateName = rs["TemplateName"].sValue; sTemplateView = rs["TemplateView"].sValue; sTemplateText = rs["TemplateText"].sValue; lSystemReference = rs["SystemReference"].lValue;
                        rs.MoveNext();
                    }

                    return ""+lTemplateID + ";" + sTemplateName + ";" + sTemplateView + ";" + sTemplateText + ";" + lSystemReference;

                case "Delete":
                    arItemID = sItemID.Split('_');
                    DataMethods2.glDBDelete(oClientInfo, sTables, "TemplateID=" + arItemID[0]);

                    return "Erfolgreich gelöscht";
            }
            

            return "test";
        }
    }
}
