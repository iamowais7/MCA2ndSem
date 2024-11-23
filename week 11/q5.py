'''. You have been given a dataset demo.csv having independent features as x1, x2, x3, 
   x4, x5, x6, x7 and dependent feature as y with value either 0 or 1. All independent 
   features are continuous data except x1 and x2, which are having nominal data. Now 
   write python program for the following: 
   a. Clean independent features 
   b. Add one more feature x7 having values between 0 and 1. 
   c. Perform scaling 
   d. Train this dataset using Logistic regression, Decision Tree and Random Forest. 
   Compare the performance of all the models based on accuracy and F1 score. 
   e. Draw confusion matrix of each model '''
   
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler, LabelEncoder
from sklearn.linear_model import LogisticRegression
from sklearn.tree import DecisionTreeClassifier
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score, f1_score, confusion_matrix, ConfusionMatrixDisplay
import matplotlib.pyplot as plt

# Load dataset
data = pd.read_csv(r"D:\python\week 11\demo.csv")

# Step a: Clean independent features
# Assuming nominal data for x1 and x2, we'll use Label Encoding or One-Hot Encoding as needed

# Label encode x1 and x2 if they are categorical
label_encoders = {}
for col in ['x1', 'x2']:
    if data[col].dtype == 'object':
        le = LabelEncoder()
        data[col] = le.fit_transform(data[col])
        label_encoders[col] = le

# Step b: Add one more feature x7 with values between 0 and 1
data['x7'] = np.random.uniform(0, 1, data.shape[0])

# Separate features and target variable
X = data.drop('y', axis=1)
y = data['y']

# Step c: Perform scaling
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)

# Split data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X_scaled, y, test_size=0.2, random_state=42)

# Step d: Train dataset using Logistic Regression, Decision Tree, and Random Forest
# Define models
models = {
    'Logistic Regression': LogisticRegression(),
    'Decision Tree': DecisionTreeClassifier(),
    'Random Forest': RandomForestClassifier()
}

# Train, predict, and evaluate each model
results = {}
for model_name, model in models.items():
    model.fit(X_train, y_train)
    y_pred = model.predict(X_test)
    accuracy = accuracy_score(y_test, y_pred)
    f1 = f1_score(y_test, y_pred)
    results[model_name] = {
        'Accuracy': accuracy,
        'F1 Score': f1,
        'Confusion Matrix': confusion_matrix(y_test, y_pred)
    }
    print(f"{model_name} - Accuracy: {accuracy:.4f}, F1 Score: {f1:.4f}")

# Step e: Draw confusion matrix for each model
fig, axes = plt.subplots(1, 3, figsize=(18, 6))
for idx, (model_name, result) in enumerate(results.items()):
    ConfusionMatrixDisplay(result['Confusion Matrix']).plot(ax=axes[idx])
    axes[idx].set_title(f"{model_name} Confusion Matrix")

plt.show()
   
   
   
   
   
   
   
   
   
   
   