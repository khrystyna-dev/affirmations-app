package com.example.affirmationsapp

import android.content.Context
import com.example.affirmationsapp.adapter.ItemAdapter
import com.example.affirmationsapp.model.Affirmation
import junit.framework.TestCase
import org.junit.Test
import org.mockito.Mockito

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val context = Mockito.mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)
        TestCase.assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}