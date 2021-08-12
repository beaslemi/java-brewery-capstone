

<template>
  <form action="">
    <div class="form-group">
      <label for="brewery-name" class="highlight-white">Brewery Name: </label>
      <input class="form-control" id="brewery-name" type="text" v-model="brewery.name" />
    </div>
    <div class="form-group">
      <label for="brewery-website" class="highlight-white">Website URL: </label>
      <input class="form-control" id="brewery-website" type="text" v-model="brewery.website" />
    </div>
    <div class="form-group">
      <label for="brewery-phone" class="highlight-white">Phone: </label>
      <input class="form-control" id="brewery-phone" type="text" v-model="brewery.phone" />
    </div>
    <div class="form-group">
      <label for="brewery-history" class="highlight-white">History: </label>
      <textarea class="form-control " id="brewery-history" v-model="brewery.history"></textarea>
    </div>
    <div class="form-group">
      <label for="brewery-address" class="highlight-white">Address: </label>
      <textarea class="form-control" id="brewery-address" v-model="brewery.address"></textarea>
    </div>
    <div class="form-group">
      <label for="brewery-hours" class="highlight-white"
        >Hours of Operation:
      </label>
      <textarea
        class="form-control" id="brewery-hours"
        v-model="brewery.hoursOfOperation"
      ></textarea>
    </div>
    <br>
    <div class="actions">
      &nbsp;<button class="rounded" v-on:click.prevent="resetForm" type="cancel">Cancel</button
      >&nbsp; &nbsp;<button class="rounded" v-on:click.prevent="createBrewery">
        Add Brewery
      </button>
    </div>
  </form>
</template>

<script>
import breweryService from "../services/BreweryService";

export default {
  data() {
    return {
      brewery: {},
    };
  },

  props: {
    breweryID: {
      type: Number,
      default: 0,
    },
  },

  methods: {
    createBrewery() {
      const newBrewery = {
        breweryId: Number(this.$route.params.breweryID),
        name: this.brewery.name,
        website: this.brewery.website,
        phone: this.brewery.phone,
        history: this.brewery.history,
        address: this.brewery.address,
        hoursOfOperation: this.brewery.hoursOfOperation,
      };

      if (this.breweryID === 0) {
        // add
        breweryService
          .addBrewery(newBrewery)
          .then((response) => {
            if (response.status == 201) {
              this.$router.push("/");
            }
          })
          .catch((error) => {
            this.handleErrorResponse(error, "adding");
          });
      }
    },
  },

  resetForm() {
    this.brewery = {};
  },

  name: "brewery-form",
};
</script>

<style>
</style>