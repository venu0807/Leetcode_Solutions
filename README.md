# Leetcode Solutions

Personal archive of solved Leetcode problems. One folder per problem, named by numeric ID and slug, each containing the solution and brief notes.

## Features

- 408+ problems solved
- Numeric ID prefix (`0001-two-sum`, `0042-trapping-rain-water`, etc.) — sorts in problem order
- Per-problem folder: solution + short notes
- Not tied to a single language

## Tech Stack

Pure source code, language varies per solution. No framework, no build step.

| Component | Notes |
|-----------|-------|
| Format | Plain source files in numbered folders |
| Tests | None bundled |
| Runner | Whatever each problem needs to execute |

## Quick Start

```bash
git clone <this repo>
cd Leetcode_Solutions
ls 0001-two-sum/
```

Open the folder for the problem number you want to review.

## Project Structure

```
.
├── 0001-two-sum/
│   └── solution.ext
├── 0006-zigzag-conversion/
├── 0042-trapping-rain-water/
├── ...                        # 408+ folders
├── README.md
```

Files outside the numbered folders: a single root `.md` (notes/index) and a single `.json` (aggregated stats or dataset reference, see root).

## Configuration

None. Plain source on disk.

## Deployment

N/A — static archive. Browse on disk or via the GitHub web UI.

## License

MIT
