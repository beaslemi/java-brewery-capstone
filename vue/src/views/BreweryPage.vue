<template>
  <div>
    <br />
    <span class="highlight-white">
      <h1>Brewery Information</h1>
      <br />
      <router-link
        v-bind:to="{
          name: 'update-brewery',
          params: { breweryId: brewery.id },
        }"
      >
        <button class="rounded" v-if="isBrewer">Update Brewery</button>
      </router-link>
    </span>
    <div>
      <br>
      <h2>{{ brewery.name }}</h2>
      <h3>{{ brewery.website }}</h3>
      <h3>{{ brewery.address }}</h3>
      <h3>{{ brewery.phone }}</h3>
      <h3>{{ brewery.hoursOfOperation }}</h3>
      <h3>{{ brewery.history }}</h3>
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
      return this.$store.state.breweries.find(
        (brewery) => brewery.id === this.$route.params.breweryId
      );
    },
    isBrewer() {
      if (this.$store.state.user.authorities == undefined) {
        return false;
      } else if (this.$store.state.user.authorities[0].name === "ROLE_BREWER") {
        return true;
      }
      return false;
    },
  },
};
</script>

<style>
h1 {
  
  background-color: rgba(0, 0, 0, 0.315);
  color: rgb(223, 145, 0);
}

h2 {
  padding: 20px;
  background-color: rgba(0, 0, 0, 0.315);
  color: white;
  border: 1px solid whitesmoke;
  text-overflow: ellipsis;
  overflow: visible;
  font: 2rem "AmstelvarAlpha", sans-serif;
}

h3 {
  padding: 10px;
  background-color: rgba(0, 0, 0, 0.315);
  color: white;

  border: 1px solid whitesmoke;
  text-overflow: ellipsis;
  overflow: visible;
  font: 2rem "AmstelvarAlpha", sans-serif;
}
</style>