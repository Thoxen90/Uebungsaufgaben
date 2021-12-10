function mOnLoad() {
    mRefreshList();
}

function mRefreshList(){
    gListViewLoadPage('lstMain', -1);
}

function cmdRefresh_OnClick() {
    mRefreshList();
}

function mOnOK() {
    
    var sURL = msWebPageRoot + '/ie50/Addon/iptArchivierung/ArchivierungsProcess.aspx?Method=Create';
    gSetCacheValue('iptTemplateText', document.all.txtTemplateText.value);
    var sParams = '&TemplateID=' + document.all.txtTemplateID.value + '&TemplateName="' + document.all.txtTemplateName.value + '"&TemplateView="' + document.all.txtTemplateView.value
       + '"&SystemReference=' + document.all.txtSystemReference.value;
    var sRes = gsCallServerMethod(sURL + sParams);

    alert(sRes);
    if (sRes == "Erfolgreich erstellt!") {
        window.location.reload();
    } else {
        mRefreshList();
    }
}




function mOnListViewClick(sListView, sItemID) {
    var sURL = msWebPageRoot + '/ie50/Addon/iptArchivierung/ArchivierungsProcess.aspx?Method=GetDLGParams';
    var sParams = '&sItemID=' + sItemID;
    var sRes = gsCallServerMethod(sURL + sParams);

    var StringSplit = sRes.split(';');
    document.all.txtTemplateID.value = StringSplit[0];
    document.all.txtTemplateName.value = StringSplit[1];
    document.all.txtTemplateView.value = StringSplit[2];
    document.all.txtTemplateText.value = StringSplit[3];
    document.all.txtSystemReference.value = StringSplit[4];
}

function mOnListViewBtnClick(sListView, sColID, sItemID) {
    if (gbConfirmYesNo) {
        switch (sColID) {
            case 'Löschen':
                var sURL = msWebPageRoot + '/ie50/Addon/iptArchivierung/ArchivierungsProcess.aspx?Method=Delete';
                var sParams = '&sItemID=' + sItemID;
                var sRes = gsCallServerMethod(sURL + sParams);
                alert(sRes);
                mRefreshList();
                break;
        }
    }
    
}

function mOnClose() {


}

