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
      <textarea class="form-control" id="brewery-history" v-model="brewery.history"></textarea>
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
      >&nbsp; &nbsp;<button class="rounded" v-on:click.prevent="reviseBrewery">
        Update Brewery
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

  created() {
    console.log(`in brewery with ${this.$route.params.breweryId}`);
    this.brewery = this.$store.state.breweries.find((brewery) => {
      if (this.$route.params.breweryId == brewery.id) {
        return true;
      }
      return false;
    });
  },

  methods: {
    reviseBrewery() {
      let brewery = {};
      brewery.id = this.$route.params.breweryId;
      brewery.name = this.brewery.name;
      brewery.website = this.brewery.website;
      brewery.phone = this.brewery.phone;
      brewery.history = this.brewery.history;
      brewery.address = this.brewery.address;
      brewery.hoursOfOperation = this.brewery.hoursOfOperation;
      breweryService
        .updateBrewery(brewery, this.$route.params.breweryId)
        .then((response) => {
          if (response.status == 200) {
            this.$router.push("/");
          }
        })
        .catch((error) => {
          this.handleErrorResponse(error, "updating");
        });
    },
  },

  resetForm() {
    this.brewery = {};
  },

  name: "update-form",
};
</script>

<style>
</style>