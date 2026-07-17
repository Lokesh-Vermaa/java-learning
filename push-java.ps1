param(
    [Parameter(Mandatory = $true)]
    [string]$Message
)

Write-Host "Staging all changes..."
git add .

Write-Host "Committing changes..."
git commit -m $Message

Write-Host "Pushing to GitHub..."
git push
