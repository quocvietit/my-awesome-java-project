USE [shop]
GO

INSERT INTO [dbo].[product]
           ([id]
		   ,[description]
           ,[name]
           ,[price])
     VALUES
           ( 123,'Ahihi',
           'Ahihi',
           0)
GO

select * from product
