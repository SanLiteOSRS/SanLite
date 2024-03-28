import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class128 {
	@ObfuscatedName("ct")
	static String field1538;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2081349477
	)
	public final int field1539;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	public class128 field1543;
	@ObfuscatedName("af")
	float[][] field1531;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lsq;"
	)
	final class470[] field1532;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lsq;"
	)
	class470[] field1533;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lsq;"
	)
	class470[] field1536;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	class470 field1535;
	@ObfuscatedName("aw")
	boolean field1530;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	class470 field1537;
	@ObfuscatedName("al")
	boolean field1529;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	class470 field1534;
	@ObfuscatedName("ag")
	float[][] field1540;
	@ObfuscatedName("ai")
	float[][] field1541;
	@ObfuscatedName("ax")
	float[][] field1542;

	@ObfuscatedSignature(
		descriptor = "(ILur;Z)V"
	)
	public class128(int var1, Buffer var2, boolean var3) {
		this.field1535 = new class470(); // L: 13
		this.field1530 = true; // L: 14
		this.field1537 = new class470(); // L: 15
		this.field1529 = true; // L: 16
		this.field1534 = new class470(); // L: 17
		this.field1539 = var2.readShort(); // L: 23
		this.field1532 = new class470[var1]; // L: 24
		this.field1533 = new class470[this.field1532.length]; // L: 25
		this.field1536 = new class470[this.field1532.length];
		this.field1531 = new float[this.field1532.length][3];

		for (int var4 = 0; var4 < this.field1532.length; ++var4) {
			this.field1532[var4] = new class470(var2, var3);
			this.field1531[var4][0] = var2.method9273();
			this.field1531[var4][1] = var2.method9273(); // L: 31
			this.field1531[var4][2] = var2.method9273();
		}

		this.method2974();
	} // L: 35

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1524113772"
	)
	void method2974() {
		this.field1540 = new float[this.field1532.length][3]; // L: 38
		this.field1541 = new float[this.field1532.length][3]; // L: 39
		this.field1542 = new float[this.field1532.length][3]; // L: 40
		class470 var1 = HealthBar.method2579(); // L: 41

		for (int var2 = 0; var2 < this.field1532.length; ++var2) { // L: 42
			class470 var3 = this.method2961(var2); // L: 43
			var1.method8411(var3); // L: 44
			var1.method8445(); // L: 45
			this.field1540[var2] = var1.method8409(); // L: 46
			this.field1541[var2][0] = var3.field4872[12]; // L: 47
			this.field1541[var2][1] = var3.field4872[13]; // L: 48
			this.field1541[var2][2] = var3.field4872[14]; // L: 49
			this.field1542[var2] = var3.method8420(); // L: 50
		}

		var1.method8460(); // L: 52
	} // L: 53

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lsq;",
		garbageValue = "966608496"
	)
	class470 method2961(int var1) {
		return this.field1532[var1]; // L: 56
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lsq;",
		garbageValue = "-1640892724"
	)
	class470 method2962(int var1) {
		if (this.field1533[var1] == null) { // L: 60
			this.field1533[var1] = new class470(this.method2961(var1)); // L: 61
			if (this.field1543 != null) { // L: 62
				this.field1533[var1].method8414(this.field1543.method2962(var1)); // L: 63
			} else {
				this.field1533[var1].method8414(class470.field4873); // L: 66
			}
		}

		return this.field1533[var1]; // L: 69
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsq;",
		garbageValue = "26"
	)
	class470 method2963(int var1) {
		if (this.field1536[var1] == null) { // L: 73
			this.field1536[var1] = new class470(this.method2962(var1)); // L: 74
			this.field1536[var1].method8445(); // L: 75
		}

		return this.field1536[var1]; // L: 77
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I)V",
		garbageValue = "543378690"
	)
	void method2964(class470 var1) {
		this.field1535.method8411(var1); // L: 81
		this.field1530 = true; // L: 82
		this.field1529 = true; // L: 83
	} // L: 84

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lsq;",
		garbageValue = "1337670682"
	)
	class470 method2965() {
		return this.field1535; // L: 87
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lsq;",
		garbageValue = "-2092975483"
	)
	class470 method2966() {
		if (this.field1530) { // L: 91
			this.field1537.method8411(this.method2965()); // L: 92
			if (this.field1543 != null) { // L: 93
				this.field1537.method8414(this.field1543.method2966()); // L: 94
			}

			this.field1530 = false; // L: 96
		}

		return this.field1537; // L: 98
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsq;",
		garbageValue = "-107"
	)
	public class470 method2967(int var1) {
		if (this.field1529) { // L: 102
			this.field1534.method8411(this.method2963(var1)); // L: 103
			this.field1534.method8414(this.method2966()); // L: 104
			this.field1529 = false; // L: 105
		}

		return this.field1534; // L: 107
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "70"
	)
	float[] method2983(int var1) {
		return this.field1540[var1]; // L: 111
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-347946372"
	)
	float[] method2969(int var1) {
		return this.field1541[var1]; // L: 115
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "784401959"
	)
	float[] method2959(int var1) {
		return this.field1542[var1]; // L: 119
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "5"
	)
	static int method2995() {
		return ++Messages.Messages_count - 1; // L: 19
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldn;",
		garbageValue = "-70"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferOwnWorldComparator.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = FaceNormal.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "4"
	)
	static final void method2989(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = class10.method92(var5, var6); // L: 5860
		int var7 = 2048 - var3 & 2047; // L: 5861
		int var8 = 2048 - var4 & 2047; // L: 5862
		int var9 = 0; // L: 5863
		int var10 = 0; // L: 5864
		int var11 = var5; // L: 5865
		int var12;
		int var13;
		int var14;
		if (var7 != 0) { // L: 5866
			var12 = Rasterizer3D.Rasterizer3D_sine[var7]; // L: 5867
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7]; // L: 5868
			var14 = var13 * var10 - var5 * var12 >> 16; // L: 5869
			var11 = var5 * var13 + var12 * var10 >> 16; // L: 5870
			var10 = var14; // L: 5871
		}

		if (var8 != 0) { // L: 5873
			var12 = Rasterizer3D.Rasterizer3D_sine[var8]; // L: 5874
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8]; // L: 5875
			var14 = var9 * var13 + var11 * var12 >> 16; // L: 5876
			var11 = var13 * var11 - var9 * var12 >> 16; // L: 5877
			var9 = var14; // L: 5878
		}

		if (Client.isCameraLocked) { // L: 5880
			MusicPatchPcmStream.field3573 = var0 - var9; // L: 5881
			Interpreter.field879 = var1 - var10; // L: 5882
			ReflectionCheck.field244 = var2 - var11; // L: 5883
			FriendsList.field4774 = var3; // L: 5884
			class344.field3667 = var4; // L: 5885
		} else {
			WorldMapLabelSize.cameraX = var0 - var9; // L: 5888
			MouseHandler.cameraY = var1 - var10; // L: 5889
			class193.cameraZ = var2 - var11; // L: 5890
			UserComparator10.cameraPitch = var3; // L: 5891
			class17.cameraYaw = var4; // L: 5892
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class185.oculusOrbFocalPointX >> 7 != class133.localPlayer.x >> 7 || Skeleton.oculusOrbFocalPointY >> 7 != class133.localPlayer.y >> 7)) { // L: 5894 5895
			var12 = class133.localPlayer.plane; // L: 5896
			var13 = GrandExchangeOfferOwnWorldComparator.baseX * 64 + (class185.oculusOrbFocalPointX >> 7); // L: 5897
			var14 = DevicePcmPlayerProvider.baseY * 64 + (Skeleton.oculusOrbFocalPointY >> 7); // L: 5898
			HealthBarDefinition.method3818(var13, var14, var12, true); // L: 5899
		}

	} // L: 5902
}
