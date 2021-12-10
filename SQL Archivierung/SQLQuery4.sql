if not exists(select * from INFORMATION_SCHEMA.TABLES where table_name = 'IPTArchivierungsConfig')
begin
declare @Countrows int;
declare @Counter int = 1;
declare @CurrentOrderType int;
declare @Currentrn int;

select OrderType,ROW_NUMBER() over (order by (select null)) as rn into #myTempTable from tdSalesOrderTypes;
select @Countrows = Count(*) from #myTempTable;

while(@Counter <= @Countrows)
begin
select @CurrentOrderType = OrderType from #myTempTable where rn=@Counter;
select @Currentrn = rn from #myTempTable where rn=@Counter;
insert into IPTArchivierungsConfig
values(@CurrentOrderType,null,'Sales')
set @Counter =@Counter+1;
end;

drop table #myTempTable;
GO

declare @Countrows int;
declare @Counter int = 1;
declare @CurrentOrderType int;
declare @Currentrn int;
set @Counter =1;
set @Countrows = 0;

select OrderType,ROW_NUMBER() over (order by (select null)) as rn into #myTempTable from tdPurchaseOrderTypes;
select * from #myTempTable
select @Countrows = Count(*) from #myTempTable;

while(@Counter <= @Countrows)
begin
select @CurrentOrderType = OrderType from #myTempTable where rn=@Counter;
select @Currentrn = rn from #myTempTable where rn=@Counter;
insert into IPTArchivierungsConfig
values(@CurrentOrderType,null,'Purchase')
set @Counter =@Counter+1;
end;

drop table #myTempTable;
GO

declare @Countrows int;
declare @Counter int = 1;
declare @CurrentOrderType int;
declare @Currentrn int;
set @Counter =1;
set @Countrows = 0;

select LevelId,ROW_NUMBER() over (order by (select null)) as rn into #myTempTable from tdReminderLevels;
select @Countrows = Count(*) from #myTempTable;

while(@Counter <= @Countrows)
begin
select @CurrentOrderType = LevelId from #myTempTable where rn=@Counter;
select @Currentrn = rn from #myTempTable where rn=@Counter;
insert into IPTArchivierungsConfig
values(@CurrentOrderType,null,'Reminder')
set @Counter =@Counter+1;
end;
GO

end;

select * from IPTArchivierungsConfig
select * from tdPurchaseOrderTypes

