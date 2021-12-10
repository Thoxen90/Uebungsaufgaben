function mOnLoad() {
    mRefreshList();
}

function mRefreshList() {
    gListViewLoadPage('lstReference', -1);
}

function cmdRefresh_OnClick() {
    mRefreshList();
}