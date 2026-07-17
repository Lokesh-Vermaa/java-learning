param(
    [string]$Message = "Daily work backup"
)

$repoPath = "C:\Users\ADMIN\Desktop\java"
$gitExe = "C:\Program Files\Git\bin\git.exe"

Push-Location $repoPath
try {
    Write-Host "Checking repository status..."
    & $gitExe status --short --branch

    Write-Host "Staging all changes..."
    & $gitExe add --all

    $status = & $gitExe status --short
    if ([string]::IsNullOrWhiteSpace($status)) {
        Write-Host "No changes to commit."
        return
    }

    Write-Host "Committing changes..."
    & $gitExe commit -m $Message

    Write-Host "Pushing to GitHub..."
    & $gitExe push origin main
}
finally {
    Pop-Location
}
