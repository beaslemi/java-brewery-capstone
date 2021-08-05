<template>
<div>
  <div>
      <brewery-info/>
  </div>
  <div>
      <brewery-form/>
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

  name: "brewery-page"
};

</script>

<style>

</style>