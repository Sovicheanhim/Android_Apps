package com.example.async_task

import android.content.Context
import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class MyTask(context: Context, button: Button, progressBar: ProgressBar, status: TextView): AsyncTask<Void, Int, String>(){
    lateinit var context: Context
    lateinit var button: Button
    lateinit var progressBar: ProgressBar
    lateinit var status: TextView

    init {
        this.context = context
        this.button = button
        this.progressBar = progressBar
        this.status = status
    }

    override fun onPreExecute() {
//        super.onPreExecute()
        status.text = "Preparing to download..."
        Thread.sleep(3000)
    }
    override fun doInBackground(vararg p0: Void?): String {
        for(i in 1..100){
            publishProgress(i)
            Thread.sleep(80)
        }
        return "Download Completed"
    }
    override fun onProgressUpdate(vararg values: Int?) {
//        super.onProgressUpdate(*values)
        var progress = values[0]
        status.text = "Downloaded:  $progress%"
        progressBar.progress = progress!!
        button.isEnabled = false
    }

    override fun onPostExecute(result: String?) {
//        super.onPostExecute(result)
        status.text = result
    }
}