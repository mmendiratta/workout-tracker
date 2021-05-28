//package com.mendiratta.workouttracker.config
//
//import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.context.annotation.Configuration
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository
//
//
//@Configuration
//class WebSecurityConfiguration: WebSecurityConfigurerAdapter() {
//    @Autowired
//    private lateinit var restAuthenticationEntryPoint: RestAuthenticationEntryPoint
//
//    @Autowired
//    private val loginSuccessHandler: LoginSuccessHandler? = null
//
//    @Throws(Exception::class)
//    override fun configure(http: HttpSecurity) {
//        http
//            .authorizeRequests().antMatchers("/api/**").authenticated()
//            .and()
//            .httpBasic()
//            .and()
//            .exceptionHandling()
//            .authenticationEntryPoint(restAuthenticationEntryPoint)
//            .and()
//            .formLogin()
//            .loginProcessingUrl("/api/login")
//            .successHandler(loginSuccessHandler)
//            .failureHandler(SimpleUrlAuthenticationFailureHandler())
//        http.csrf().ignoringAntMatchers("/api/login").csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//    }
//}