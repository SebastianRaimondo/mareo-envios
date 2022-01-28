alter table customer add primary key (id);
alter table shipping add primary key (id);
alter table product add primary key (id);
alter table shipping_item add primary key (id);

ALTER TABLE shipping
  ADD CONSTRAINT shipping_customer_fk FOREIGN KEY (customer_id) REFERENCES customer (id); 

ALTER TABLE shipping_item
  ADD CONSTRAINT shipping_item_product_fk FOREIGN KEY (product_id) REFERENCES product (id);
  
ALTER TABLE shipping_item
  ADD CONSTRAINT shipping_item_shipping_fk FOREIGN KEY (shipping_id) REFERENCES shipping (id);