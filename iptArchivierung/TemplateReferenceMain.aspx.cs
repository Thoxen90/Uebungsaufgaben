using System;
using myfactory.FrontendSystem.AspSystem;


namespace ASP.Addon.iptArchivierung
{
    public partial class TemplateReferenceMain : myfactory.FrontendSystem.AspSystem.DialogPage
    {
        public TemplateReferenceMain() : base()
        {
            this.Load += new System.EventHandler(this.Page_Load);
        }

        protected void Page_Load(object sender, EventArgs e)
        {
            this.sTitle = "Template Referenzen";
            this.lstReference.oListView.sSettingName = "ReferenceDataSettings";
            this.sOnLoad = "mOnLoad()";
        }
    }
}
