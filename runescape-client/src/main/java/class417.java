import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public abstract class class417 implements class261 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	class456 field4651;

	class417(int var1) {
	} // L: 13

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;II)V",
		garbageValue = "1487404426"
	)
	abstract void vmethod7892(Buffer var1, int var2);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "1"
	)
	public void method7891(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 43
			}

			class413 var3 = (class413)World.findEnumerated(GraphicsObject.method2028(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4638) { // L: 21
				case 0:
					class326[] var5 = new class326[]{class326.field4140, class326.field4143, class326.field4141, class326.field4144}; // L: 33
					World.findEnumerated(var5, var1.readUnsignedByte()); // L: 35
					break; // L: 36
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 38
				case 2:
					int var4 = var1.readUnsignedByte(); // L: 23
					this.field4651 = class9.method82(var4); // L: 24
					if (this.field4651 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4); // L: 25
				case 3:
					var1.readStringCp1252NullCircumfixed(); // L: 28
				}
			} else {
				this.vmethod7892(var1, var2); // L: 41
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-3806"
	)
	boolean method7893() {
		return this.field4651 != null; // L: 48
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/Object;",
		garbageValue = "-84"
	)
	Object method7894() {
		if (this.field4651 == class456.field4874) { // L: 52
			return 0; // L: 53
		} else if (this.field4651 == class456.field4870) { // L: 55
			return -1L; // L: 56
		} else {
			return this.field4651 == class456.field4871 ? "" : null; // L: 58 59 61
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZI)I",
		garbageValue = "-377158891"
	)
	static int method7903(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		class460 var6;
		int var7;
		if (var0 != 7500 && var0 != 7508) { // L: 4927
			if (var0 != 7501) { // L: 4949
				int var19;
				int var20;
				if (var0 == 7502) { // L: 4958
					class87.Interpreter_intStackSize -= 3; // L: 4959
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 4960
					var19 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 4961
					var5 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 2]; // L: 4962
					var20 = class300.method5847(var19); // L: 4963
					var7 = class459.method8447(var19); // L: 4964
					int var21 = class163.method3422(var19); // L: 4965
					class461 var26 = HealthBarUpdate.method2365(var3); // L: 4966
					class459 var27 = class146.method3163(var20); // L: 4967
					int[] var28 = var27.field4883[var7]; // L: 4968
					int var12 = 0; // L: 4969
					int var13 = var28.length; // L: 4970
					if (var21 >= 0) { // L: 4971
						if (var21 >= var13) { // L: 4972
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13); // L: 4973
						}

						var12 = var21; // L: 4975
						var13 = var21 + 1; // L: 4976
					}

					Object[] var14 = var26.method8461(var7); // L: 4978
					if (var14 == null && var27.field4880 != null) { // L: 4979 4980
						var14 = var27.field4880[var7];
					}

					int var15;
					int var16;
					if (var14 == null) { // L: 4982
						for (var15 = var12; var15 < var13; ++var15) { // L: 4983
							var16 = var28[var15]; // L: 4984
							class456 var22 = class9.method82(var16); // L: 4985
							if (var22 == class456.field4871) { // L: 4986
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							} else {
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = class18.method269(var16); // L: 4987
							}
						}

						return 1; // L: 4989
					} else {
						var15 = var14.length / var28.length; // L: 4991
						if (var5 >= 0 && var5 < var15) { // L: 4992
							for (var16 = var12; var16 < var13; ++var16) { // L: 4995
								int var17 = var16 + var28.length * var5; // L: 4996
								class456 var18 = class9.method82(var28[var16]); // L: 4997
								if (var18 == class456.field4871) { // L: 4998
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (String)var14[var17];
								} else {
									Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (Integer)var14[var17]; // L: 4999
								}
							}

							return 1; // L: 5001
						} else {
							throw new RuntimeException(); // L: 4993
						}
					}
				} else if (var0 == 7503) { // L: 5003
					class87.Interpreter_intStackSize -= 2; // L: 5004
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 5005
					var19 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize + 1]; // L: 5006
					var5 = 0; // L: 5007
					var20 = class300.method5847(var19); // L: 5008
					var7 = class459.method8447(var19); // L: 5009
					class461 var25 = HealthBarUpdate.method2365(var3); // L: 5010
					class459 var9 = class146.method3163(var20); // L: 5011
					int[] var10 = var9.field4883[var7]; // L: 5012
					Object[] var11 = var25.method8461(var7); // L: 5013
					if (var11 == null && var9.field4880 != null) { // L: 5014 5015
						var11 = var9.field4880[var7]; // L: 5016
					}

					if (var11 != null) { // L: 5019
						var5 = var11.length / var10.length;
					}

					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5; // L: 5020
					return 1; // L: 5021
				} else if (var0 != 7504 && var0 != 7510) { // L: 5023
					if (var0 == 7505) { // L: 5040
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 5041
						class461 var24 = HealthBarUpdate.method2365(var3); // L: 5042
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var24.field4891; // L: 5043
						return 1; // L: 5044
					} else if (var0 == 7506) { // L: 5046
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 5047
						var19 = -1; // L: 5048
						if (PcmPlayer.field333 != null && var3 >= 0 && var3 < PcmPlayer.field333.size()) { // L: 5049
							var19 = (Integer)PcmPlayer.field333.get(var3); // L: 5050
						}

						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var19; // L: 5052
						return 1; // L: 5053
					} else if (var0 != 7507 && var0 != 7509) { // L: 5055
						return 2; // L: 5082
					} else {
						var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 5056
						var4 = class130.method3031(var3); // L: 5057
						var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 5058
						var6 = LoginScreenAnimation.method2407(var5); // L: 5059
						if (var6 == null) { // L: 5060
							throw new RuntimeException(); // L: 5061
						} else if (class300.method5847(var5) != Client.field800) { // L: 5063
							throw new RuntimeException(); // L: 5064
						} else if (PcmPlayer.field333 == null && PcmPlayer.field333.isEmpty()) { // L: 5066
							throw new RuntimeException(); // L: 5067
						} else {
							var7 = class163.method3422(var5); // L: 5069
							List var8 = var6.method8451(var4, var7); // L: 5070
							PcmPlayer.field333 = new LinkedList(PcmPlayer.field333); // L: 5071
							if (var8 != null) { // L: 5072
								PcmPlayer.field333.retainAll(var8); // L: 5073
							} else {
								PcmPlayer.field333.clear(); // L: 5076
							}

							Timer.field4460 = PcmPlayer.field333.iterator(); // L: 5078
							if (var0 == 7507) { // L: 5079
								Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = PcmPlayer.field333.size();
							}

							return 1; // L: 5080
						}
					}
				} else {
					--class87.Interpreter_intStackSize; // L: 5024
					var3 = Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize]; // L: 5025
					class460 var23 = class412.method7854(var3); // L: 5026
					if (var23 == null) { // L: 5027
						throw new RuntimeException(); // L: 5028
					} else {
						PcmPlayer.field333 = var23.method8451(0, 0); // L: 5030
						var5 = 0; // L: 5031
						if (PcmPlayer.field333 != null) { // L: 5032
							Client.field800 = var3; // L: 5033
							Timer.field4460 = PcmPlayer.field333.iterator(); // L: 5034
							var5 = PcmPlayer.field333.size(); // L: 5035
						}

						if (var0 == 7504) { // L: 5037
							Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var5;
						}

						return 1; // L: 5038
					}
				}
			} else {
				if (Timer.field4460 != null && Timer.field4460.hasNext()) { // L: 4950
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = (Integer)Timer.field4460.next(); // L: 4951
				} else {
					Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = -1; // L: 4954
				}

				return 1; // L: 4956
			}
		} else {
			var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4928
			var4 = class130.method3031(var3); // L: 4929
			var5 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]; // L: 4930
			var6 = LoginScreenAnimation.method2407(var5); // L: 4931
			if (var6 == null) { // L: 4932
				throw new RuntimeException(); // L: 4933
			} else {
				var7 = class163.method3422(var5); // L: 4935
				PcmPlayer.field333 = var6.method8451(var4, var7); // L: 4936
				if (PcmPlayer.field333 != null) { // L: 4937
					Client.field800 = class300.method5847(var5); // L: 4938
					Timer.field4460 = PcmPlayer.field333.iterator(); // L: 4939
					if (var0 == 7500) { // L: 4940
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = PcmPlayer.field333.size();
					}
				} else {
					Client.field800 = -1; // L: 4943
					Timer.field4460 = null; // L: 4944
					if (var0 == 7500) { // L: 4945
						Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1; // L: 4947
			}
		}
	}
}
