'''Consider two features x and y based on the following function: 
   y = x12 + 3x2 + c, where c can be prepared based on 1000 random values between 0 
   and 1 
   Now generate 1000 random values between 0 and 1 for x1 and x2. Calculate y based 
   on above function. Now train Polynomial Regression model and check the score for 
   the same. '''
   
import numpy as np
from sklearn.preprocessing import PolynomialFeatures
from sklearn.linear_model import LinearRegression
from sklearn.metrics import r2_score

# Step 1: Generate 1000 random values for x1, x2, and c
np.random.seed(0)  # For reproducibility
x1 = np.random.rand(1000)
x2 = np.random.rand(1000)
c = np.random.rand(1000)

# Step 2: Calculate y based on the given function y = x1^2 + 3*x2 + c
y = x1**2 + 3*x2 + c

# Step 3: Prepare data for polynomial regression
X = np.column_stack((x1, x2))  # Combine x1 and x2 into a single matrix
poly = PolynomialFeatures(degree=2)  # Create polynomial features up to degree 2
X_poly = poly.fit_transform(X)  # Transform X into polynomial features

# Step 4: Train the polynomial regression model
model = LinearRegression()
model.fit(X_poly, y)

# Step 5: Predict and evaluate the model
y_pred = model.predict(X_poly)
score = r2_score(y, y_pred)

score


   
   