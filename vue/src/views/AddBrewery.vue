<template>
  <div>
    <span class="highlight-white">
      <h1>Add A Brewery</h1>
    </span>
    <div>
      <brewery-form />
    </div>
  </div>
</template>

<script>
import BreweryForm from "@/components/BreweryForm";

export default {
  components: {
    BreweryForm,
  },

  name: "add-brewery",
};
</script>

<style>
</style>