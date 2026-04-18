# UC8 Setup - Stream Filtering

## ✅ Completed Setup

### Folder Structure
```
App/
├── src/
│   ├── main/
│   │   ├── App.java
│   │   └── UseCase8TrainConsistMgmt.java  (UC8 implementation)
│   └── test/
│       └── UseCase8TrainConsistMgmtTest.java  (UC8 tests)
├── lib/  (for dependencies)
└── App.iml
```

### Git Branch
✅ Branch created: `uc8-stream-filter`

### Files Created
✅ `UseCase8TrainConsistMgmt.java` - Stream filtering logic
✅ `UseCase8TrainConsistMgmtTest.java` - 6 test cases included

## ⚙️ Next Step: Add JUnit in IntelliJ

**In IntelliJ IDEA:**

1. Go to **File → Project Structure** (or **⌘ + ,** on Mac)
2. Select **Libraries** on the left
3. Click **+** → **From Maven**
4. Search for: `org.junit.jupiter:junit-jupiter:5.10.0`
5. Click **Add** and **OK**

This will download and configure JUnit for your project.

## 📝 Current UC8 Implementation

**Logic:** Stream filtering with capacity threshold
```java
return bogies.stream()
             .filter(b -> b.getCapacity() > threshold)
             .collect(Collectors.toList());
```

**Test Cases Included:**
1. ✓ Capacity > threshold (should include)
2. ✓ Capacity = threshold (should NOT include)
3. ✓ Capacity < threshold (should include only higher)
4. ✓ Empty list handling
5. ✓ Original list remains unchanged
6. ✓ Null list handling

## 🚀 Next Actions

1. **Add JUnit** (see steps above)
2. **Run tests**: Right-click `UseCase8TrainConsistMgmtTest.java` → Run
3. **All tests should pass ✓**
4. **Commit & Push**:
   ```bash
   git add .
   git commit -m "UC8 - Stream filtering implemented with tests"
   git push origin uc8-stream-filter
   ```
5. **Merge to main**:
   ```bash
   git checkout main
   git pull origin main
   git merge uc8-stream-filter
   git push origin main
   ```

## 📋 Ready for UC9-UC20

Just repeat this process for each use case! The structure is now ready.
