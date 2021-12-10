using System;

namespace ASP.Addon.iptArchivierung
{
    public partial class ArchivierungMain : myfactory.FrontendSystem.AspSystem.DialogPage
    {
        public ArchivierungMain() : base()
        {
            this.Load += new System.EventHandler(this.Page_Load);
        }
        protected void Page_Load(object sender, EventArgs e)
        {
            this.sTitle = "Archivierungs Templates";
            this.lstMain.oListView.sSettingName = "ArchivierungDataSettings";
            this.sOnLoad = "mOnLoad()";

        }
    }
}
