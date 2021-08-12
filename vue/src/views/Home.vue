<template>
  <div class="home">
    <br>
    <h1>Home</h1>
    <br>
    <h3>
      This application shows information about breweries and beers. Beer lovers
      can view information about breweries and beers, while brewers can update
      the information about their products. Administrators can add breweries to
      the system.
    </h3>
    <br>
    <button>
      <h2><brewery-list /></h2>
    </button>
    <!-- <p>You must be authenticated to see this</p> -->
  </div>
</template>

<script>
import BreweryList from "@/components/BreweryList";

export default {
  components: {
    BreweryList,
  },
  methods: {},

  name: "home",
};
</script>

