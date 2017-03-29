# Scala Verstack

This Scala **SBT** project is used by me to manage lots of commits with tests for **Atomic Scala** book and some other sources.
Code is changing every time and stored in commits history.

## Development

- `sbt run` compile and run
- `sbt ~ ;scalastyle ;test` watch and lint and rerun tests every time
- `sbt coverageOn` measures coverage but makes watching perform slowly
- `sbt coverageOff` suitable for watching
- `sbt coverageReport` - report for code coverage
