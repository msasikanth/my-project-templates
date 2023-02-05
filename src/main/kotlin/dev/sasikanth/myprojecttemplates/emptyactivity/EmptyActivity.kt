package dev.sasikanth.myprojecttemplates

import com.android.tools.idea.wizard.template.escapeKotlinIdentifier

fun emptyActivity(
  packageName: String,
  activityClass: String
) = """
package ${escapeKotlinIdentifier(packageName)}

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class $activityClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

"""
