import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lc")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lln;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque(); // L: 11
		this.mixer = new PcmStreamMixer(); // L: 12
		this.superStream = var1; // L: 15
	} // L: 16

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Llq;[IIIII)V",
		garbageValue = "1090554723"
	)
	void method5950(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3405[var1.field3467] & 4) != 0 && var1.field3464 < 0) { // L: 73
			int var6 = this.superStream.field3410[var1.field3467] / (PcmPlayer.field306 * -1110828124); // L: 74

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3469) / var6; // L: 76
				if (var7 > var4) { // L: 77
					var1.field3469 += var6 * var4; // L: 99
					break;
				}

				var1.stream.fill(var2, var3, var7); // L: 78
				var3 += var7; // L: 79
				var4 -= var7; // L: 80
				var1.field3469 += var6 * var7 - 1048576; // L: 81
				int var8 = PcmPlayer.field306 * -1110828124 / 100; // L: 82
				int var9 = 262144 / var6; // L: 83
				if (var9 < var8) { // L: 84
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream; // L: 85
				if (this.superStream.field3408[var1.field3467] == 0) { // L: 86
					var1.stream = RawPcmStream.method978(var1.rawSound, var10.method918(), var10.method909(), var10.method941()); // L: 87
				} else {
					var1.stream = RawPcmStream.method978(var1.rawSound, var10.method918(), 0, var10.method941()); // L: 90
					this.superStream.method5805(var1, var1.patch.field3436[var1.field3454] < 0); // L: 91
					var1.stream.method1014(var8, var10.method909()); // L: 92
				}

				if (var1.patch.field3436[var1.field3454] < 0) { // L: 94
					var1.stream.setNumLoops(-1);
				}

				var10.method916(var8); // L: 95
				var10.fill(var2, var3, var5 - var3); // L: 96
				if (var10.method1021()) { // L: 97
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4); // L: 101
	} // L: 102

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Llq;IB)V",
		garbageValue = "1"
	)
	void method5948(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3405[var1.field3467] & 4) != 0 && var1.field3464 < 0) { // L: 105
			int var3 = this.superStream.field3410[var1.field3467] / (PcmPlayer.field306 * -1110828124); // L: 106
			int var4 = (var3 + 1048575 - var1.field3469) / var3; // L: 107
			var1.field3469 = var3 * var2 + var1.field3469 & 1048575; // L: 108
			if (var4 <= var2) { // L: 109
				if (this.superStream.field3408[var1.field3467] == 0) { // L: 110
					var1.stream = RawPcmStream.method978(var1.rawSound, var1.stream.method918(), var1.stream.method909(), var1.stream.method941()); // L: 111
				} else {
					var1.stream = RawPcmStream.method978(var1.rawSound, var1.stream.method918(), 0, var1.stream.method941()); // L: 114
					this.superStream.method5805(var1, var1.patch.field3436[var1.field3454] < 0); // L: 115
				}

				if (var1.patch.field3436[var1.field3454] < 0) { // L: 117
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3469 / var3; // L: 118
			}
		}

		var1.stream.skip(var2); // L: 121
	} // L: 122

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lbp;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last(); // L: 19
		if (var1 == null) {
			return null; // L: 20
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream()); // L: 21 22
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lbp;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous(); // L: 27
			if (var1 == null) {
				return null; // L: 28
			}
		} while(var1.stream == null); // L: 29

		return var1.stream;
	}

	@ObfuscatedName("al")
	protected int vmethod5949() {
		return 0; // L: 34
	}

	@ObfuscatedName("at")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3); // L: 40

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) { // L: 41
			if (!this.superStream.method5878(var6)) { // L: 42
				int var4 = var2; // L: 43
				int var5 = var3; // L: 44

				do {
					if (var5 <= var6.field3462) { // L: 45
						this.method5950(var6, var1, var4, var5, var5 + var4); // L: 51
						var6.field3462 -= var5; // L: 52
						break;
					}

					this.method5950(var6, var1, var4, var6.field3462, var4 + var5); // L: 46
					var4 += var6.field3462; // L: 47
					var5 -= var6.field3462; // L: 48
				} while(!this.superStream.method5798(var6, var1, var4, var5)); // L: 49
			}
		}

	} // L: 54

	@ObfuscatedName("ay")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1); // L: 58

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) { // L: 59
			if (!this.superStream.method5878(var3)) { // L: 60
				int var2 = var1; // L: 61

				do {
					if (var2 <= var3.field3462) { // L: 62
						this.method5948(var3, var2); // L: 67
						var3.field3462 -= var2; // L: 68
						break;
					}

					this.method5948(var3, var3.field3462); // L: 63
					var2 -= var3.field3462; // L: 64
				} while(!this.superStream.method5798(var3, (int[])null, 0, var2)); // L: 65
			}
		}

	} // L: 70

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "41"
	)
	static int method5944(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3967
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3968
			Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).name; // L: 3969
			return 1; // L: 3970
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3972
				Interpreter.Interpreter_intStackSize -= 2; // L: 3973
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3974
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3975
				var5 = HealthBarUpdate.ItemComposition_get(var3); // L: 3976
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) { // L: 3977
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 3978
				}

				return 1; // L: 3979
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3981
				Interpreter.Interpreter_intStackSize -= 2; // L: 3982
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3983
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3984
				var5 = HealthBarUpdate.ItemComposition_get(var3); // L: 3985
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) { // L: 3986
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++SecureRandomCallable.Interpreter_stringStackSize - 1] = ""; // L: 3987
				}

				return 1; // L: 3988
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3990
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3991
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).price; // L: 3992
				return 1; // L: 3993
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3995
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3996
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).isStackable == 1 ? 1 : 0; // L: 3997
				return 1; // L: 3998
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 4000
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4001
					var4 = HealthBarUpdate.ItemComposition_get(var3); // L: 4002
					if (var4.noteTemplate == -1 && var4.note >= 0) { // L: 4003
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4004
					}

					return 1; // L: 4005
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 4007
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4008
					var4 = HealthBarUpdate.ItemComposition_get(var3); // L: 4009
					if (var4.noteTemplate >= 0 && var4.note >= 0) { // L: 4010
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4011
					}

					return 1; // L: 4012
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 4014
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4015
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).isMembersOnly ? 1 : 0; // L: 4016
					return 1; // L: 4017
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 4019
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4020
					var4 = HealthBarUpdate.ItemComposition_get(var3); // L: 4021
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) { // L: 4022
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4023
					}

					return 1; // L: 4024
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 4026
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4027
					var4 = HealthBarUpdate.ItemComposition_get(var3); // L: 4028
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) { // L: 4029
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 4030
					}

					return 1; // L: 4031
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 4033
					String var7 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize]; // L: 4034
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4035
					class68.findItemDefinitions(var7, var6 == 1); // L: 4036
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class264.foundItemIdCount; // L: 4037
					return 1; // L: 4038
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 4040
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 4045
						FontName.foundItemIndex = 0; // L: 4046
						return 1; // L: 4047
					} else if (var0 == 4213) { // L: 4049
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4050
						var6 = HealthBarUpdate.ItemComposition_get(var3).getShiftClickIndex(); // L: 4051
						if (var6 == -1) { // L: 4052
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6; // L: 4053
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1; // L: 4056
						}

						return 1; // L: 4058
					} else if (var0 == 4214) { // L: 4060
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4061
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).maleModel; // L: 4062
						return 1; // L: 4063
					} else if (var0 == 4215) { // L: 4065
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4066
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).maleModel1; // L: 4067
						return 1; // L: 4068
					} else if (var0 == 4216) { // L: 4070
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4071
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HealthBarUpdate.ItemComposition_get(var3).maleModel2; // L: 4072
						return 1; // L: 4073
					} else if (var0 == 4217) { // L: 4075
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4076
						var4 = HealthBarUpdate.ItemComposition_get(var3); // L: 4077
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2251; // L: 4078
						return 1; // L: 4079
					} else {
						return 2; // L: 4081
					}
				} else {
					if (class399.foundItemIds != null && FontName.foundItemIndex < class264.foundItemIdCount) { // L: 4041
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class399.foundItemIds[++FontName.foundItemIndex - 1] & '\uffff'; // L: 4042
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 4043
				}
			}
		}
	}
}
