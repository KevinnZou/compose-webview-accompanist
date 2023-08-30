/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.accompanist.sample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.sample.ui.theme.AccompanistTheme
import com.google.accompanist.sample.webview.BasicWebViewSample
import com.google.accompanist.sample.webview.WebViewSaveStateSample
import com.google.accompanist.sample.webview.WrappedContentWebViewSample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccompanistTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Button(onClick = {
                                startActivity(
                                    Intent(
                                        this@MainActivity,
                                        BasicWebViewSample::class.java
                                    )
                                )
                            }) {
                                Text("Basic")
                            }
                            Button(onClick = {
                                startActivity(
                                    Intent(
                                        this@MainActivity,
                                        WebViewSaveStateSample::class.java
                                    )
                                )
                            }) {
                                Text("Save State")
                            }
                            Button(onClick = {
                                startActivity(
                                    Intent(
                                        this@MainActivity,
                                        WrappedContentWebViewSample::class.java
                                    )
                                )
                            }) {
                                Text("Wrapped Content")
                            }
                        }
                    }
                }
            }
        }
    }
}