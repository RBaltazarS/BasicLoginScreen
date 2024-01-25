package com.example.loginregistration.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginregistration.R
import com.example.loginregistration.components.ButtonComponent
import com.example.loginregistration.components.CheckboxField
import com.example.loginregistration.components.ClickableLoginTextComponent
import com.example.loginregistration.components.DividerText
import com.example.loginregistration.components.FirstTextAppTop
import com.example.loginregistration.components.MyTextField
import com.example.loginregistration.components.PasswordMyTextField
import com.example.loginregistration.components.TextCreateAppTop


@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            FirstTextAppTop(value = stringResource(id = R.string.hello))
            TextCreateAppTop(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.ic_perfil)
            )
            Spacer(modifier = Modifier.height(10.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.ic_perfil)
            )
            Spacer(modifier = Modifier.height(10.dp))
            MyTextField(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.ic_email)
            )
            Spacer(modifier = Modifier.height(10.dp))
            PasswordMyTextField(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_password)
            )

            CheckboxField(value = stringResource(id = R.string.terms_and_conditions))

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerText()

            ClickableLoginTextComponent(onTextSelected = {

            })

        }
    }
}


@Preview
@Composable
fun PreviewSignUpScreen() {
    SignUpScreen()
}