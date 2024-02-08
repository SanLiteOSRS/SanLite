import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class208 {
	@ObfuscatedName("ag")
	static byte[][][] field2278;
	@ObfuscatedName("ak")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2281;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	class217 field2271;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	class219 field2272;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1301667135
	)
	int field2279;
	@ObfuscatedName("ad")
	String field2266;
	@ObfuscatedName("ax")
	String field2275;
	@ObfuscatedName("aw")
	String field2276;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	UrlRequest field2268;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 228744253
	)
	int field2273;

	public class208() {
		this.field2279 = -1; // L: 28
		this.field2273 = 0; // L: 33
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lia;",
		garbageValue = "2034915381"
	)
	public class217 method4142() {
		return this.field2271; // L: 36
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Leg;I)Z",
		garbageValue = "622964867"
	)
	public boolean method4143(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			if (var3 == null) { // L: 43
				return false;
			} else {
				this.method4203();

				try {
					this.field2266 = var1;
					this.field2268 = var3.request(new URL(this.field2266));
					this.field2279 = 0;
				} catch (MalformedURLException var5) {
					this.method4203();
					this.field2279 = 4; // L: 54
					return false;
				}

				if (!var2.isEmpty()) { // L: 57
					this.field2276 = var2; // L: 58
				}

				return true; // L: 60
			}
		} else {
			return false; // L: 41
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1783507288"
	)
	public void method4144(String var1, String var2, String var3) {
		this.field2271 = KitDefinition.method3664(); // L: 64
		this.field2275 = var1; // L: 65
		this.field2271.method4282(this.field2275, var2, var3); // L: 66
	} // L: 67

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Leg;I)V",
		garbageValue = "-1129453669"
	)
	public void method4145(UrlRequester var1) {
		switch(this.field2279) { // L: 70
		case 0:
			this.method4163(var1); // L: 72
			break;
		case 1:
			this.method4177();
			break; // L: 77
		default:
			return; // L: 75
		}

	} // L: 80

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method4146() {
		return this.field2279; // L: 83
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1491243664"
	)
	public int method4147(String var1) {
		return this.field2272.field2355.containsKey(var1) ? (Integer)this.field2272.field2355.get(var1) : -1; // L: 87
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-56"
	)
	public String method4184(String var1) {
		return (String)((String)(this.field2272.field2359.containsKey(var1) ? this.field2272.field2359.get(var1) : null)); // L: 91
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/ArrayList;",
		garbageValue = "-23919"
	)
	public ArrayList method4149() {
		return this.field2272.field2354; // L: 95
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-40"
	)
	public ArrayList method4150() {
		return this.field2272.field2357; // L: 99
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-2005371580"
	)
	public ArrayList method4151() {
		return this.field2272.field2353; // L: 103
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1062462142"
	)
	public String method4141() {
		return this.field2272.field2356; // L: 107
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "0"
	)
	public float[] method4153() {
		return this.field2272.field2358; // L: 111
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-8577"
	)
	public String method4154() {
		return this.field2272.method4316(); // L: 115
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-334030953"
	)
	void method4203() {
		this.field2268 = null; // L: 119
	} // L: 120

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Leg;I)V",
		garbageValue = "-200766024"
	)
	void method4163(UrlRequester var1) {
		if (this.field2268 != null && this.field2268.isDone()) { // L: 123
			byte[] var2 = this.field2268.getResponse(); // L: 126
			if (var2 == null) { // L: 127
				this.method4203(); // L: 128
				this.field2279 = 4; // L: 129
			} else {
				try {
					class478 var3 = new class478(var2); // L: 133
					JSONObject var4 = var3.method8694(); // L: 134
					if (var4 == null) { // L: 135
						return;
					}

					try {
						this.field2273 = var4.getInt("version"); // L: 137
					} catch (Exception var6) { // L: 139
						this.method4203(); // L: 140
						this.field2279 = 6; // L: 141
						return; // L: 142
					}

					if (this.field2273 < 2) { // L: 144
						if (!this.field2272.method4319(var4, this.field2273, var1)) { // L: 145
							this.field2279 = 6; // L: 146
						}
					} else if (this.field2273 == 2) { // L: 149
						class221 var5 = Bounds.method8500(); // L: 150
						var5.method4351(var4, this.field2273, var1); // L: 151
						this.field2272 = var5.method4354(this.field2276); // L: 152
						if (this.field2272 != null) { // L: 153
							this.method4177(); // L: 154
							this.field2279 = 1; // L: 155
						} else {
							this.field2279 = 7; // L: 158
						}
					}
				} catch (UnsupportedEncodingException var7) { // L: 162
					this.method4203(); // L: 163
					this.field2279 = 6; // L: 164
					return; // L: 165
				}

				if (this.field2272 != null) { // L: 167
					this.field2279 = this.field2272.field2354.size() > 0 ? 1 : 2; // L: 168
				}

				this.field2268 = null; // L: 170
			}
		}
	} // L: 124 130 171

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "468386678"
	)
	void method4177() {
		Iterator var1 = this.field2272.field2354.iterator(); // L: 174

		class209 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2272.field2354.iterator(); // L: 182

				while (var1.hasNext()) {
					var2 = (class209)var1.next(); // L: 183
					if (var2.field2284 != null) { // L: 185
						byte[] var3 = var2.field2284.getResponse(); // L: 186
						if (var3 != null && var3.length > 0) { // L: 187
							this.field2279 = 2; // L: 188
							return; // L: 189
						}
					}
				}

				this.method4203(); // L: 194
				this.field2279 = 5; // L: 195
				return; // L: 196
			}

			var2 = (class209)var1.next(); // L: 175
		} while(var2.field2284 == null || var2.field2284.isDone()); // L: 177

	} // L: 178

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Leg;I)Z",
		garbageValue = "-2143084268"
	)
	public boolean method4191(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new class478(var1.getBytes())).method8694(); // L: 200

			try {
				this.field2273 = var3.getInt("version"); // L: 202
			} catch (Exception var5) { // L: 204
				this.method4203(); // L: 205
				this.field2279 = 6; // L: 206
				return false; // L: 207
			}

			if (!this.field2272.method4319(var3, this.field2273, var2)) { // L: 209
				this.field2279 = 6; // L: 210
			}

			this.field2279 = this.field2272.field2354.size() > 0 ? 1 : 2; // L: 212
		} catch (UnsupportedEncodingException var6) { // L: 214
			this.field2279 = 6; // L: 215
		}

		return this.field2279 < 3; // L: 217
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-103"
	)
	public static void method4205() {
		synchronized(MouseHandler.MouseHandler_instance) { // L: 44
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 45
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 46
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 47
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 48
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 49
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 50
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 51
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 52
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 53
		}
	} // L: 55

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-110"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-33"
	)
	static int method4155(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 4541
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class281.loadWorlds() ? 1 : 0; // L: 4542
			return 1; // L: 4543
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 4545
				var9 = class304.worldListStart(); // L: 4546
				if (var9 != null) { // L: 4547
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.id; // L: 4548
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.properties; // L: 4549
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.activity; // L: 4550
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.location; // L: 4551
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.population; // L: 4552
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.host; // L: 4553
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4556
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4557
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4558
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4559
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4560
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4561
				}

				return 1; // L: 4563
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 4565
				var9 = GameEngine.getNextWorldListWorld(); // L: 4566
				if (var9 != null) { // L: 4567
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.id; // L: 4568
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.properties; // L: 4569
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.activity; // L: 4570
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.location; // L: 4571
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.population; // L: 4572
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var9.host; // L: 4573
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4576
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4577
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4578
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4579
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4580
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4581
				}

				return 1; // L: 4583
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 4585
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4586
					var7 = null; // L: 4587

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 4588
						if (var3 == World.World_worlds[var8].id) { // L: 4589
							var7 = World.World_worlds[var8]; // L: 4590
							break;
						}
					}

					if (var7 != null) { // L: 4594
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.id; // L: 4595
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.properties; // L: 4596
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.activity; // L: 4597
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.location; // L: 4598
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.population; // L: 4599
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.host; // L: 4600
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4603
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4604
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4605
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4606
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4607
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4608
					}

					return 1; // L: 4610
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 4612
					UserComparator6.Interpreter_intStackSize -= 4; // L: 4613
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4614
					boolean var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1; // L: 4615
					var8 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2]; // L: 4616
					boolean var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3] == 1; // L: 4617
					class20.sortWorldList(var3, var10, var8, var6); // L: 4618
					return 1; // L: 4619
				} else if (var0 != 6511) { // L: 4621
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4642
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1; // L: 4643
						return 1; // L: 4644
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4646
							UserComparator6.Interpreter_intStackSize -= 2; // L: 4647
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4648
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4649
							var5 = class6.getParamDefinition(var4); // L: 4650
							if (var5.isString()) { // L: 4651
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Script.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4652
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Script.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4655
							}

							return 1; // L: 4657
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4659
							UserComparator6.Interpreter_intStackSize -= 2; // L: 4660
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4661
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4662
							var5 = class6.getParamDefinition(var4); // L: 4663
							if (var5.isString()) { // L: 4664
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class137.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4665
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class137.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4668
							}

							return 1; // L: 4670
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4672
							UserComparator6.Interpreter_intStackSize -= 2; // L: 4673
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4674
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4675
							var5 = class6.getParamDefinition(var4); // L: 4676
							if (var5.isString()) { // L: 4677
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = class341.ItemComposition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4678
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class341.ItemComposition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4681
							}

							return 1; // L: 4683
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4685
							UserComparator6.Interpreter_intStackSize -= 2; // L: 4686
							var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4687
							var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4688
							var5 = class6.getParamDefinition(var4); // L: 4689
							if (var5.isString()) { // L: 4690
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Script.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4691
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Script.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4694
							}

							return 1; // L: 4696
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4698
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4699
							return 1; // L: 4700
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4702
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.clientType; // L: 4703
							return 1; // L: 4704
						} else if (var0 == 6520) { // L: 4706
							return 1; // L: 4707
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4709
							return 1; // L: 4710
						} else if (var0 == 6522) { // L: 4712
							--class211.Interpreter_stringStackSize; // L: 4713
							--UserComparator6.Interpreter_intStackSize; // L: 4714
							return 1; // L: 4715
						} else if (var0 == 6523) { // L: 4717
							--class211.Interpreter_stringStackSize; // L: 4718
							--UserComparator6.Interpreter_intStackSize; // L: 4719
							return 1; // L: 4720
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4722
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4723
							return 1; // L: 4724
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4726
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 4727
							return 1; // L: 4728
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4730
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1; // L: 4731
							return 1; // L: 4732
						} else if (var0 == 6527) { // L: 4734
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.field667; // L: 4735
							return 1; // L: 4736
						} else {
							return 2; // L: 4738
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4622
					if (var3 >= 0 && var3 < World.World_count) { // L: 4623
						var7 = World.World_worlds[var3]; // L: 4624
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.id; // L: 4625
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.properties; // L: 4626
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.activity; // L: 4627
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.location; // L: 4628
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7.population; // L: 4629
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.host; // L: 4630
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1; // L: 4633
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4634
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4635
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4636
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0; // L: 4637
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = ""; // L: 4638
					}

					return 1; // L: 4640
				}
			}
		}
	}
}
