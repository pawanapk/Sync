package com.adsrole.sync.chromecast

import android.content.Context
import com.adsrole.sync.R
import com.google.android.gms.cast.framework.CastOptions
import com.google.android.gms.cast.framework.OptionsProvider

class CastOptionsProvider : OptionsProvider {
    override fun getCastOptions(ctx: Context): CastOptions {
        return CastOptions
                .Builder()
                .setReceiverApplicationId(
                        ctx.getString(R.string.receiver_id)
                )
                .build()
    }

    override fun getAdditionalSessionProviders(ctx: Context) = null
}