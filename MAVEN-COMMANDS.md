# 🚀 Quick Reference - JUnit + Maven Commands

## For ANY Text Editor (VS Code, Sublime, etc.)

### Compile
```bash
cd App
mvn clean compile
```

### Run Tests
```bash
mvn test
```

### Run Specific Test
```bash
mvn test -Dtest=UseCase8TrainConsistMgmtTest
```

### Build JAR
```bash
mvn package
```

### Full Clean Build
```bash
mvn clean install
```

---

## UC8 Status
✅ All 6 tests PASSING
✅ Stream filtering implemented
✅ Ready to push

---

## Workflow for Each UC (UC8-UC20)

### Step 1: Create Branch
```bash
git checkout -b uc9-your-feature
```

### Step 2: Create Files in the pattern
```
App/src/main/UseCase9YourFeature.java
App/src/test/UseCase9YourFeatureTest.java
```

### Step 3: Write Code & Tests
- Edit in any text editor
- Maven handles JUnit automatically

### Step 4: Run Tests
```bash
mvn test
```

### Step 5: Commit & Push
```bash
git add .
git commit -m "UC9 - Your feature description"
git push origin uc9-your-feature
```

### Step 6: Merge to Main
```bash
git checkout main
git pull origin main
git merge uc9-your-feature
git push origin main
```

---

## Maven Dependencies Already Included
- JUnit 5 Jupiter API (5.10.0)
- JUnit 5 Jupiter Engine (5.10.0)
- Surefire plugin for testing

No IntelliJ needed! 🎉
