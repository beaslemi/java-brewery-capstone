<template>
  <div>
    <span class="highlight-white">
      <h1> Brewery Information</h1>
      <br />
      <button v-if="$store.state.token != ''"> 
    <router-link v-bind:to="{name: 'update-brewery'}">
        Update Brewery
    </router-link>
        </button>

      
    </span>
 <div>

<h2>{{brewery.name}}</h2>
<h3>{{brewery.website}}</h3>
<h3>{{brewery.address}}</h3>
<h3>{{brewery.phone}}</h3>
<h3>{{brewery.hoursOfOperation}}</h3>
 <h3>{{brewery.history}}</h3>

 </div>
    <div>
      <!-- <brewery-info/> -->
    </div>
  </div>
</template>

<script>

//import BreweryInfo from "@/components/BreweryInfo";

export default {
  
 name: "brewery-page",
  
  computed: {
    brewery() {
      console.log(`${this.$route.params.breweryId}`);
      return this.$store.state.breweries.find(brewery => brewery.id === this.$route.params.breweryId);
    },
  }
};

</script>

<style>

h1 {
  background-color: rgba(0, 0, 0, 0.315);
  color: white;
  
}

h2 {
  background-color: rgba(0, 0, 0, 0.315);
  color: white;
  width: 1000px;
  border: 1px solid whitesmoke;
  text-overflow: ellipsis;
  overflow: visible;
  font: 2rem 'AmstelvarAlpha', sans-serif;
  
  
}

h3{
  background-color: rgba(0, 0, 0, 0.315);
  color: white;
  width: 1000px;
  border: 1px solid whitesmoke;
  text-overflow: ellipsis;
  overflow: visible;
   font: 2rem 'AmstelvarAlpha', sans-serif;
}
</style>