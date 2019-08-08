package org.usfirst.frc.team4028.robot.util;

import org.usfirst.frc.team4028.robot.subsystems.Chassis.GearShiftPosition;

public class TwoGearSuperShort extends MotionProfile{
			
	public TwoGearSuperShort() {
		super(1.0, -1.0, false, GearShiftPosition.LOW_GEAR);
	}

		// Position (rotations)	Velocity (R/S)	Acceleration (R/S^2) Heading () Duration (ms)
		
		public static double [][]LeftPoints = new double [][]{
			{0.000000, 0.000000, 0.000000, 0.000000, 0.02},
			{0.001206, 0.060264, 3.011265, 0.000100, 0.02},
			{0.004808, 0.180088, 5.990973, 0.000100, 0.02},
			{0.010807, 0.300091, 6.002969, 0.000099, 0.02},
			{0.019208, 0.420111, 6.002130, 0.000098, 0.02},
			{0.030012, 0.540194, 6.003854, 0.000094, 0.02},
			{0.043219, 0.660310, 6.005572, 0.000090, 0.02},
			{0.058829, 0.780426, 6.005229, 0.000083, 0.02},
			{0.076836, 0.900503, 6.004852, 0.000075, 0.02},
			{0.097251, 1.020548, 6.000926, 0.000066, 0.02},
			{0.120059, 1.140556, 6.001342, 0.000057, 0.02},
			{0.145267, 1.260516, 5.998530, 0.000049, 0.02},
			{0.172878, 1.380475, 5.997539, 0.000041, 0.02},
			{0.202892, 1.500442, 5.997305, 0.000034, 0.02},
			{0.235296, 1.620397, 5.998617, 0.000028, 0.02},
			{0.270104, 1.740347, 5.997221, 0.000022, 0.02},
			{0.307311, 1.860311, 5.998085, 0.000017, 0.02},
			{0.346917, 1.980279, 5.998286, 0.000013, 0.02},
			{0.388923, 2.100250, 5.998495, 0.000009, 0.02},
			{0.433324, 2.220220, 5.998956, 0.000006, 0.02},
			{0.480128, 2.340194, 5.998586, 0.000003, 0.02},
			{0.529337, 2.460181, 5.998794, 0.000001, 0.02},
			{0.580939, 2.580168, 5.999528, -0.000002, 0.02},
			{0.634940, 2.700150, 5.999282, -0.000004, 0.02},
			{0.691334, 2.820126, 5.999683, -0.000006, 0.02},
			{0.750143, 2.940113, 5.998643, -0.000007, 0.02},
			{0.811341, 3.060105, 6.000070, -0.000009, 0.02},
			{0.874947, 3.180096, 5.999092, -0.000010, 0.02},
			{0.940951, 3.300094, 5.999722, -0.000012, 0.02},
			{1.009355, 3.420090, 5.999584, -0.000013, 0.02},
			{1.078790, 3.472199, 2.605813, -0.000014, 0.02},
			{1.145979, 3.359570, -5.631607, -0.000014, 0.02},
			{1.210777, 3.239558, -6.000018, -0.000015, 0.02},
			{1.273166, 3.119547, -6.000780, -0.000016, 0.02},
			{1.333151, 2.999548, -6.000482, -0.000016, 0.02},
			{1.390752, 2.879537, -5.999449, -0.000016, 0.02},
			{1.445939, 2.759524, -6.001004, -0.000016, 0.02},
			{1.498728, 2.639526, -6.000193, -0.000017, 0.02},
			{1.549117, 2.519524, -6.000153, -0.000017, 0.02},
			{1.597107, 2.399522, -6.000269, -0.000017, 0.02},
			{1.642702, 2.279511, -5.999830, -0.000016, 0.02},
			{1.685896, 2.159493, -6.000386, -0.000016, 0.02},
			{1.726679, 2.039493, -6.001070, -0.000016, 0.02},
			{1.765075, 1.919487, -5.999315, -0.000015, 0.02},
			{1.801063, 1.799471, -6.000964, -0.000014, 0.02},
			{1.834649, 1.679472, -6.000653, -0.000013, 0.02},
			{1.865835, 1.559475, -6.000418, -0.000012, 0.02},
			{1.894631, 1.439456, -5.999422, -0.000011, 0.02},
			{1.921017, 1.319440, -6.001595, -0.000009, 0.02},
			{1.945004, 1.199446, -6.000198, -0.000008, 0.02},
			{1.966597, 1.079437, -5.999323, -0.000006, 0.02},
			{1.985783, 0.959439, -6.000766, -0.000004, 0.02},
			{2.002575, 0.839449, -5.998315, -0.000003, 0.02},
			{2.016965, 0.719455, -5.999438, -0.000002, 0.02},
			{2.028952, 0.599487, -5.999419, -0.000001, 0.02},
			{2.038542, 0.479522, -5.998489, -0.000000, 0.02},
			{2.045734, 0.359529, -5.998457, -0.000000, 0.02},
			{2.050524, 0.239541, -6.000864, -0.000000, 0.02},
			{2.052918, 0.119402, -5.991240, -0.000000, 0.02}};
			
		public static double [][]RightPoints = new double[][]{
			{0.000000, 0.000000, 0.000000, 0.000000, 0.02},
			{0.001206, 0.060262, 3.011206, 0.000100, 0.02},
			{0.004808, 0.180070, 5.990126, 0.000100, 0.02},
			{0.010805, 0.300015, 6.000071, 0.000099, 0.02},
			{0.019202, 0.419916, 5.996185, 0.000098, 0.02},
			{0.029999, 0.539817, 5.994748, 0.000094, 0.02},
			{0.043193, 0.659711, 5.994482, 0.000090, 0.02},
			{0.058787, 0.779611, 5.994426, 0.000083, 0.02},
			{0.076775, 0.899525, 5.996706, 0.000075, 0.02},
			{0.097169, 1.019487, 5.996746, 0.000066, 0.02},
			{0.119955, 1.139487, 6.000978, 0.000057, 0.02},
			{0.145143, 1.259497, 6.000985, 0.000049, 0.02},
			{0.172735, 1.379536, 6.001589, 0.000041, 0.02},
			{0.202733, 1.499597, 6.002000, 0.000034, 0.02},
			{0.235121, 1.619647, 6.003336, 0.000028, 0.02},
			{0.269916, 1.739685, 6.001630, 0.000022, 0.02},
			{0.307111, 1.859728, 6.002048, 0.000017, 0.02},
			{0.346707, 1.979765, 6.001768, 0.000013, 0.02},
			{0.388704, 2.099797, 6.001522, 0.000009, 0.02},
			{0.433097, 2.219819, 6.001570, 0.000006, 0.02},
			{0.479894, 2.339838, 6.000839, 0.000003, 0.02},
			{0.529096, 2.459865, 6.000745, 0.000001, 0.02},
			{0.580693, 2.579886, 6.001219, -0.000002, 0.02},
			{0.634689, 2.699897, 6.000754, -0.000004, 0.02},
			{0.691078, 2.819899, 6.000975, -0.000006, 0.02},
			{0.749883, 2.939909, 5.999785, -0.000007, 0.02},
			{0.811077, 3.059921, 6.001088, -0.000009, 0.02},
			{0.874681, 3.179930, 6.000008, -0.000010, 0.02},
			{0.940681, 3.299945, 6.000562, -0.000012, 0.02},
			{1.009083, 3.419956, 6.000359, -0.000013, 0.02},
			{1.078515, 3.472082, 2.606658, -0.000014, 0.02},
			{1.145702, 3.359474, -5.630611, -0.000014, 0.02},
			{1.210499, 3.239478, -5.999152, -0.000015, 0.02},
			{1.272886, 3.119482, -6.000021, -0.000016, 0.02},
			{1.332870, 2.999498, -5.999795, -0.000016, 0.02},
			{1.390471, 2.879499, -5.998812, -0.000016, 0.02},
			{1.445658, 2.759499, -6.000394, -0.000016, 0.02},
			{1.498445, 2.639512, -5.999599, -0.000017, 0.02},
			{1.548835, 2.519523, -5.999553, -0.000017, 0.02},
			{1.596825, 2.399533, -5.999650, -0.000017, 0.02},
			{1.642421, 2.279535, -5.999175, -0.000016, 0.02},
			{1.685615, 2.159531, -5.999679, -0.000016, 0.02},
			{1.726399, 2.039546, -6.000296, -0.000016, 0.02},
			{1.764796, 1.919557, -5.998459, -0.000015, 0.02},
			{1.800786, 1.799561, -6.000011, -0.000014, 0.02},
			{1.834374, 1.679582, -5.999595, -0.000013, 0.02},
			{1.865563, 1.559609, -5.999275, -0.000012, 0.02},
			{1.894363, 1.439614, -5.998225, -0.000011, 0.02},
			{1.920752, 1.319621, -6.000439, -0.000009, 0.02},
			{1.944743, 1.199645, -5.999252, -0.000008, 0.02},
			{1.966340, 1.079646, -5.998821, -0.000006, 0.02},
			{1.985530, 0.959644, -6.000982, -0.000004, 0.02},
			{2.002326, 0.839632, -5.999403, -0.000003, 0.02},
			{2.016719, 0.719601, -6.001316, -0.000002, 0.02},
			{2.028708, 0.599588, -6.001688, -0.000001, 0.02},
			{2.038300, 0.479580, -6.000608, -0.000000, 0.02},
			{2.045492, 0.359555, -6.000036, -0.000000, 0.02},
			{2.050282, 0.239549, -6.001777, -0.000000, 0.02},
			{2.052676, 0.119403, -5.991600, -0.000000, 0.02}};
}