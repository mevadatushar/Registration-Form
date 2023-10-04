<?php

use Illuminate\Foundation\Testing\WithoutMiddleware;
use Illuminate\Foundation\Testing\DatabaseMigrations;
use Illuminate\Foundation\Testing\DatabaseTransactions;

class MainActivityTest extends TestCase
{
    /**
     * A basic test example.
     *
     * @return void
     */
    public function testSubmitForm()
    {
        $response = $this->post('/submit-form', [
            'name' => 'John Doe',
            'email' => 'johndoe@example.com',
            'phone' => '1234567890',
            'dob' => '1990-01-01'
        ]);

        $response->assertStatus(200)
                    ->assertJson([
                        'message' => 'Form submitted successfully'
                    ]);
    }

    public function testName()
    {
        $response = $this->get('/get-name/johndoe');

        $response->assertStatus(200)
                    ->assertJson([
                        'name' => 'John Doe'
                    ]);
    }

    public function testEmail()
    {
        $response = $this->get('/get-email/johndoe@example.com');

        $response->assertStatus(200)
                    ->assertJson([
                        'email' => 'johndoe@example.com'
                    ]);
    }

    public function testPhone()
    {
        $response = $this->get('/get-phone/1234567890');

        $response->assertStatus(200)
                    ->assertJson([
                        'phone' => '1234567890'
                    ]);
    }

    public function testDOB()
    {
        $response = $this->get('/get-dob/1990-01-01');

        $response->assertStatus(200)
                    ->assertJson([
                        'dob' => '1990-01-01'
                    ]);
    }
}