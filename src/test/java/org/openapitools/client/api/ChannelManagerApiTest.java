/*
 * Channel Manager Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import GeminiCommerce_ChannelManager.ApiException;
import org.openapitools.client.model.ChannelmanagerAssociationResponse;
import org.openapitools.client.model.ChannelmanagerChannelResponse;
import org.openapitools.client.model.ChannelmanagerChannelResponseWithAssociations;
import org.openapitools.client.model.ChannelmanagerCreateAssociationRequest;
import org.openapitools.client.model.ChannelmanagerCreateChannelRequest;
import org.openapitools.client.model.ChannelmanagerCreateMarketRequest;
import org.openapitools.client.model.ChannelmanagerDeleteAssociationRequest;
import org.openapitools.client.model.ChannelmanagerDeleteChannelRequest;
import org.openapitools.client.model.ChannelmanagerDeleteMarketRequest;
import org.openapitools.client.model.ChannelmanagerGetChannelRequest;
import org.openapitools.client.model.ChannelmanagerGetChannelWithAssociationsRequest;
import org.openapitools.client.model.ChannelmanagerGetMarketRequest;
import org.openapitools.client.model.ChannelmanagerGetMarketWithAssociationsRequest;
import org.openapitools.client.model.ChannelmanagerListChannelsRequest;
import org.openapitools.client.model.ChannelmanagerListChannelsResponse;
import org.openapitools.client.model.ChannelmanagerListChannelsWithAssociationsRequest;
import org.openapitools.client.model.ChannelmanagerListChannelsWithAssociationsResponse;
import org.openapitools.client.model.ChannelmanagerListMarketsRequest;
import org.openapitools.client.model.ChannelmanagerListMarketsResponse;
import org.openapitools.client.model.ChannelmanagerListMarketsWithAssociationsRequest;
import org.openapitools.client.model.ChannelmanagerListMarketsWithAssociationsResponse;
import org.openapitools.client.model.ChannelmanagerMarketResponse;
import org.openapitools.client.model.ChannelmanagerMarketResponseWithAssociations;
import org.openapitools.client.model.ChannelmanagerUpdateChannelRequest;
import org.openapitools.client.model.ChannelmanagerUpdateMarketRequest;
import org.openapitools.client.model.RpcStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChannelManagerApi
 */
@Disabled
public class ChannelManagerApiTest {

    private final ChannelManagerApi api = new ChannelManagerApi();

    /**
     * CreateAssociation
     *
     * Create a new association between a channel and a market or entities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerCreateAssociationTest() throws ApiException {
        ChannelmanagerCreateAssociationRequest body = null;
        ChannelmanagerAssociationResponse response = api.channelManagerCreateAssociation(body);
        // TODO: test validations
    }

    /**
     * CreateChannel
     *
     * Create a new channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerCreateChannelTest() throws ApiException {
        ChannelmanagerCreateChannelRequest body = null;
        ChannelmanagerChannelResponse response = api.channelManagerCreateChannel(body);
        // TODO: test validations
    }

    /**
     * CreateMarket
     *
     * Create a new market
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerCreateMarketTest() throws ApiException {
        ChannelmanagerCreateMarketRequest body = null;
        ChannelmanagerMarketResponse response = api.channelManagerCreateMarket(body);
        // TODO: test validations
    }

    /**
     * DeleteAssociation
     *
     * Delete an existing association between a channel and a market or entities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerDeleteAssociationTest() throws ApiException {
        ChannelmanagerDeleteAssociationRequest body = null;
        Object response = api.channelManagerDeleteAssociation(body);
        // TODO: test validations
    }

    /**
     * DeleteChannel
     *
     * Soft delete an existing channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerDeleteChannelTest() throws ApiException {
        ChannelmanagerDeleteChannelRequest body = null;
        Object response = api.channelManagerDeleteChannel(body);
        // TODO: test validations
    }

    /**
     * DeleteMarket
     *
     * Soft delete an existing market
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerDeleteMarketTest() throws ApiException {
        ChannelmanagerDeleteMarketRequest body = null;
        Object response = api.channelManagerDeleteMarket(body);
        // TODO: test validations
    }

    /**
     * GetChannel
     *
     * Get an existing channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerGetChannelTest() throws ApiException {
        ChannelmanagerGetChannelRequest body = null;
        ChannelmanagerChannelResponse response = api.channelManagerGetChannel(body);
        // TODO: test validations
    }

    /**
     * GetChannelWithAssociations
     *
     * Get an existing channel with associations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerGetChannelWithAssociationsTest() throws ApiException {
        ChannelmanagerGetChannelWithAssociationsRequest body = null;
        ChannelmanagerChannelResponseWithAssociations response = api.channelManagerGetChannelWithAssociations(body);
        // TODO: test validations
    }

    /**
     * GetMarket
     *
     * Get an existing market
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerGetMarketTest() throws ApiException {
        ChannelmanagerGetMarketRequest body = null;
        ChannelmanagerMarketResponse response = api.channelManagerGetMarket(body);
        // TODO: test validations
    }

    /**
     * GetMarketWithAssociations
     *
     * Get an existing market with associations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerGetMarketWithAssociationsTest() throws ApiException {
        ChannelmanagerGetMarketWithAssociationsRequest body = null;
        ChannelmanagerMarketResponseWithAssociations response = api.channelManagerGetMarketWithAssociations(body);
        // TODO: test validations
    }

    /**
     * ListChannels
     *
     * List all channels
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerListChannelsTest() throws ApiException {
        ChannelmanagerListChannelsRequest body = null;
        ChannelmanagerListChannelsResponse response = api.channelManagerListChannels(body);
        // TODO: test validations
    }

    /**
     * ListChannelsWithAssociations
     *
     * List all channels with associations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerListChannelsWithAssociationsTest() throws ApiException {
        ChannelmanagerListChannelsWithAssociationsRequest body = null;
        ChannelmanagerListChannelsWithAssociationsResponse response = api.channelManagerListChannelsWithAssociations(body);
        // TODO: test validations
    }

    /**
     * ListMarkets
     *
     * List all markets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerListMarketsTest() throws ApiException {
        ChannelmanagerListMarketsRequest body = null;
        ChannelmanagerListMarketsResponse response = api.channelManagerListMarkets(body);
        // TODO: test validations
    }

    /**
     * ListMarketsWithAssociations
     *
     * List all markets with associations
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerListMarketsWithAssociationsTest() throws ApiException {
        ChannelmanagerListMarketsWithAssociationsRequest body = null;
        ChannelmanagerListMarketsWithAssociationsResponse response = api.channelManagerListMarketsWithAssociations(body);
        // TODO: test validations
    }

    /**
     * UpdateChannel
     *
     * Update an existing channel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerUpdateChannelTest() throws ApiException {
        ChannelmanagerUpdateChannelRequest body = null;
        ChannelmanagerChannelResponse response = api.channelManagerUpdateChannel(body);
        // TODO: test validations
    }

    /**
     * UpdateMarket
     *
     * Update an existing market
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void channelManagerUpdateMarketTest() throws ApiException {
        ChannelmanagerUpdateMarketRequest body = null;
        ChannelmanagerMarketResponse response = api.channelManagerUpdateMarket(body);
        // TODO: test validations
    }

}
