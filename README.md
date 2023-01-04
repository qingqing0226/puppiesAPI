## Puppies API backend

- This is the backend of puppiesAPi built with `spring boot` and `postgres`
- The frontend is [here](https://github.com/qingqing0226/puppiesAPI-frontend) built with `React` and `TypeScript`

a RESTful API with the following endpoints:

- GET: `api/puppies`. This should return a list of all puppies in JSON-format.
- GET: `api/puppies/:id`. This should return one puppy in JSON-format.
- POST: `api/puppies`. This should create and return the newly added puppy.
- PUT: `api/puppies/:id`. This should put one puppy down (jk, just update the specific puppy).
- DELETE: `api/puppies/:id`. This should actually put one puppy down aka delete it.

`puppy` have the following attributes: 
- id
- breed
- name
- birth date
