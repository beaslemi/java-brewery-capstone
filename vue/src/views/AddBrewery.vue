<template>
<div>
    <span class="highlight-white">
    This is our add brewery page!
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
components: {
    BreweryForm,
    BreweryInfo

  },

  name: "add-brewery"
};

</script>

<style>

</style>