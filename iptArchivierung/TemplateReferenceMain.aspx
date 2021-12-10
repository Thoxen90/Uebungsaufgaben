<%@ Page Language="C#" AutoEventWireup="false" EnableViewState="false" CodeFile="TemplateReferenceMain.aspx.cs" Inherits="ASP.Addon.iptArchivierung.TemplateReferenceMain" %>
<%@ Register TagPrefix="myfactory" Namespace="myfactory.FrontendSystem.AspControls" Assembly="wfAspControls" %>

<html>
<head>
    <link href="../../../css/wfStyleMenu.css" type="text/css" rel="stylesheet" />
    <link href="../../../css/wfStyleDefault.css" type="text/css" rel="stylesheet" />
    <link href="../../../css/wfStyleDialogTable.css" type="text/css" rel="stylesheet" />

    <myfactory:wfPageHeader ID="ctlPageHeader" runat="server"></myfactory:wfPageHeader>
    <title></title>
</head>
<body id="ctlBody" style="overflow: hidden" runat="server">
    <table class="borderTable" height="65%" width="20%" cellspacing="1" cellpadding="1">
        <tr>
            <td>
                <myfactory:wfListView runat="server" ID="lstReference" sListViewDataPage="TemplateReferenceData.aspx"></myfactory:wfListView>
            </td>
        </tr>
    </table>
    <table class="borderTable" height="25%" width="100%" cellspacing="1" cellpadding="1">
        <tr>
            <td>
                <myfactory:wfXmlDialog runat="server" ID="dlgEdit" sDialog="/ie50/Addon/iptArchivierung/dlgReference.xml"></myfactory:wfXmlDialog>
            </td>
        </tr>
    </table>
    <table class="bordertable" height="10%" width="100%" cellspacing="1" cellpadding="1">
        <tr>
            <td align="left">
                <myfactory:wfButton runat="server" ID="cmdrefresh" sText="aktualisieren" sOnClick="monrefresh()"></myfactory:wfButton>
            </td>
            <td align="right">
                <myfactory:wfButton runat="server" ID="cmdok" sText="speichern" sOnClick="monok()" bDisabled="true"></myfactory:wfButton>
                <myfactory:wfButton runat="server" ID="cmdclose" sText="schließen" sOnClick="monclose()"></myfactory:wfButton>
            </td>
        </tr>
    </table>
</body>
</html>
