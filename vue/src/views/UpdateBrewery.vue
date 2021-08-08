<template>
<div>
    <span class="highlight-white">
    This is our update brewery page!
    </span>
  <div>
      <brewery-form/>
  </div>
  <div>
      <brewery-info/>
  </div>
  </div>
</template>

<script>
import BreweryForm from '@/components/BreweryForm';
import BreweryInfo from '@/components/BreweryInfo';

export default {
props: ["show-update"],

components: {
    BreweryForm,
    BreweryInfo

  },

  name: "update-brewery"
};

</script>

<style>

</style>