//
//  main.cpp
//  URI 1163
//
//  Created by Shawon Ashraf on 11/23/16.
//  Copyright © 2016 Shawon Ashraf. All rights reserved.
//

#include <iostream>
#include <cmath>
#include <iomanip>
#include <utility>

#define PI 3.14159
#define G 9.80665

using namespace std;

bool hitsOrNot(float horizontalRange, float p1, float p2);
float getHorizontalRange(float angle, float velocity, float height);


int main() {
    float h, angle1, velocity, p1, p2;
    int nTries;
    
    cin >> h;
    cin >> p1 >> p2;
    cin >> nTries;
    
    for(int i = 0; i < nTries; i++) {
        cin >> angle1 >> velocity;
        
        float horizontalDistance = getHorizontalRange((angle1 * PI / 180), velocity, h);
        bool hits = hitsOrNot(horizontalDistance, p1, p2);
        
        if(hits) {
            cout << fixed << setprecision(5) << horizontalDistance << " -> DUCK" << endl;
        }
        else {
            cout << fixed << setprecision(5) << horizontalDistance << " -> NUCK" << endl;
        }
    }
    
    
    return 0;
}


bool hitsOrNot(float horizontalRange, float p1, float p2) {
    bool f = false;
    
    if(horizontalRange >= p1 && horizontalRange <= p2) f = true;
    
    return f;
}

float getHorizontalRange(float angle, float velocity, float height) {
    float horizontalDistance = 0.0;
    
    float a = (velocity * cos(angle)) / G;
    float b = velocity * sin(angle) + sqrt(pow(velocity * sin(angle), 2) + 2 * G * height);
    
    horizontalDistance = a * b;
    
    return horizontalDistance;
}
