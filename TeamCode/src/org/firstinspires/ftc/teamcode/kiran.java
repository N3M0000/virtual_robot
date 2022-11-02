package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.ColorSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous(name = "kiran", group = "kiran")

public class kiran  extends LinearOpMode {



    @Override
    public void runOpMode() throws InterruptedException {
        DcMotor backleft = hardwareMap.dcMotor.get("back_left_motor");
        DcMotor backright = hardwareMap.dcMotor.get("back_right_motor");
        DcMotor frontleft = hardwareMap.dcMotor.get("front_left_motor");
        DcMotor frontright = hardwareMap.dcMotor.get("front_right_motor");
        ElapsedTime mRuntime = new ElapsedTime();
        ColorSensor colorSensor = hardwareMap.colorSensor.get("color_sensor");
        DistanceSensor frontDistance = hardwareMap.get(DistanceSensor.class, "front_distance");
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backleft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backright.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        /*while (mRuntime.time() < 0.96) {
            backleft.setPower(1);
            backright.setPower(1);
            frontleft.setPower(1);
            frontright.setPower(1);
        } */


        while(frontright.getCurrentPosition() < 1400) {
            frontleft.setPower(1);
            backright.setPower(-1);
            backleft.setPower(-1);
            frontright.setPower(1);
        }

    }
        /*colorSensor.red();

        if (colorSensor.red() < 20) {
            while (mRuntime.time() > 2 && mRuntime.time() < 3) {
            backleft.setPower(1);
            backright.setPower(1);
        }
    } else {
            while (mRuntime.time() > 2 && mRuntime.time() < 3) {
                backleft.setPower(1);
                backright.setPower(1);
            }
        }*/
}