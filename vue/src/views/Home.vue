<template>
  <div class="home">
    <h1>Home</h1>
    
      <button>Add a Brewery</button>
    
    <brewery-list/>
   <!-- <p>You must be authenticated to see this</p> -->
  </div>
</template>

<script>
import BreweryList from '@/components/BreweryList';


export default {
components: {
    BreweryList

  },

  name: "home"
};
</script>

