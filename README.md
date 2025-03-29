
# Add Product in BUulk
```
curl --location 'http://localhost:8080/api/product/bulk' \
--header 'Content-Type: application/json' \
--data '[
          {
            "name": "Laptop",
            "price": 1200.50,
            "category": { "id": 4 }
          },
          {
            "name": "Smartphone",
            "price": 799.99,
            "category": { "id": 4 }
          },
          {
            "name": "T-Shirt",
            "price": 19.99,
            "category": { "id": 5 }
          },
          {
            "name": "Microwave Oven",
            "price": 150.75,
            "category": { "id": 6 }
          }
        ]'

```

# Add categories

```
      curl --location 'http://localhost:8080/api/categories' \
      --header 'Content-Type: application/json' \
      --data '{
                "name": "Electronics"
               }'
      
```

# Add categories in bluk
```
      curl --location 'http://localhost:8080/api/categories/bulk' \
      --header 'Content-Type: application/json' \
      --data '[
                { "name": "Utensils" },
                { "name": "Fashion" },
                { "name": "Home & Kitchen" },
                { "name": "Books" },
                { "name": "Sports & Outdoors" }
              ]'
```


# Search product based on category 
```
curl --location 'http://localhost:8080/api/product/category/1?page=0&size=10&sort=name%2Cdesc' \
--header 'Accept: application/json'




```
