package com.chizu.backfill.controller;

import com.chizu.backfill.model.*;
import com.chizu.backfill.service.BackfillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : chizubeokwuosa
 * @Description :
 * @created : chizubeokwuosa, Tuesday
 **/
@RestController
@RequestMapping("register")
public class BackfillController {


    private final BackfillService backfillService;

    public BackfillController(BackfillService backfillService) {
        this.backfillService = backfillService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupDto signup) {
        try {
            Staff staff = backfillService.signup(signup);
            return ResponseEntity.ok(staff);
        } catch (IllegalArgumentException e) {

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    // signin
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestBody SigninDto signin) {
        try {
            Staff staff = backfillService.signin(signin);
            return ResponseEntity.ok(staff);
        } catch (IllegalArgumentException e) {

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }

    }

    @PostMapping("/backfill")
    public ResponseEntity<?> backfill(@RequestBody AbsenceDto absenceDto) {
        try {
            Absence absence = backfillService.backfill(absenceDto);
            return ResponseEntity.ok(absence);
        } catch (IllegalArgumentException e) {

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    @GetMapping("/absences")
    public ResponseEntity<?> getAllAbsences(@RequestBody StaffDto staffDto) {

        try {
            List<AbsenceDto> absence = backfillService.getAllAbsences(staffDto);
            return ResponseEntity.ok(absence);
        } catch (IllegalArgumentException e) {

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    @GetMapping("/replacements")
    public ResponseEntity<?> getReplacements(@RequestBody StaffDto staffDto) {

        try {
            List<StaffDto> replacements = backfillService.getReplacements(staffDto);
            return ResponseEntity.ok(replacements);
        } catch (IllegalArgumentException e) {

            return ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body(e.getMessage());
        }
    }

    @GetMapping("/selected")
    public ResponseEntity<?> getSelectedAbsences(@RequestBody StaffDto staffDto) {

        try {
            String selectedAbsences = backfillService.getSelectedAbsences(staffDto);
            return ResponseEntity.ok(selectedAbsences);
        } catch (IllegalArgumentException e) {

            return ResponseEntity
                   .status(HttpStatus.BAD_REQUEST)
                   .body(e.getMessage());
        }
    }

}
