select OrderType,ROW_NUMBER() over (order by (select null)) as rn,'Sales' as Entity into #myTempTable3 from tdSalesOrderTypes;
select OrderType,ROW_NUMBER() over (order by (select null)) as rn,'Purchase' as Entity into #myTempTable2 from tdPurchaseOrderTypes; 
select LevelId as OrderType,ROW_NUMBER() over (order by (select null)) as rn,'Reminder' as Entity into #myTempTable from tdReminderLevels;

merge IPTArchivierungsConfig t using #myTempTable s on (s.OrderType = t.OrderTypeID)
when not matched by TARGET
then
insert (OrderTypeID,TemplateID,Entity)
values (s.OrderType,null,s.Entity)
;

merge IPTArchivierungsConfig t using #myTempTable2 s on (s.OrderType = t.OrderTypeID)
when not matched by TARGET
then
insert (OrderTypeID,TemplateID,Entity)
values (s.OrderType,null,s.Entity)
;

merge IPTArchivierungsConfig t using #myTempTable3 s on (s.OrderType = t.OrderTypeID)
when not matched by TARGET
then
insert (OrderTypeID,TemplateID,Entity)
values (s.OrderType,null,s.Entity)
;

drop table #myTempTable, #myTempTable2, #myTempTable3;


delete from IPTArchivierungsConfig

select * from IPTArchivierungsConfig
