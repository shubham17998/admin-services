DELETE FROM master.bulkupload_transaction;
INSERT INTO master.bulkupload_transaction(id, entity_name, upload_operation, status_code, record_count, uploaded_by, upload_category, uploaded_dtimes, upload_description, lang_code, is_active, cr_by, cr_dtimes, upd_by, upd_dtimes, is_deleted, del_dtimes) VALUES
('1234','blocklisted','Insert','Completed','1','superadmin','masterdata',TIMESTAMP '2018-12-10 11:42:52.994',null,'eng',true,'superadmin',TIMESTAMP '2018-12-10 11:42:52.994',null,null,null,null),
('3456','ZoneUser','Insert','Completed','1','superadmin','masterdata',TIMESTAMP '2018-12-10 11:42:52.994',null,'eng',true,'superadmin',TIMESTAMP '2018-12-10 11:42:52.994',null,null,null,null);