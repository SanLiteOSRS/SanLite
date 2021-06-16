import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ne")
public class class375 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static final class375 field4134;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static final class375 field4127;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	public static final class375 field4128;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1544272871
	)
	final int field4129;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 928638061
	)
	public final int field4137;
	@ObfuscatedName("o")
	public final Class field4132;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	final class371 field4133;

	static {
		field4134 = new class375(1, 0, Integer.class, new class372());
		field4127 = new class375(0, 1, Long.class, new class374());
		field4128 = new class375(2, 2, String.class, new class376());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnq;)V"
	)
	class375(int var1, int var2, Class var3, class371 var4) {
		this.field4129 = var1;
		this.field4137 = var2;
		this.field4132 = var3;
		this.field4133 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4137;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)Ljava/lang/Object;",
		garbageValue = "728831584"
	)
	public Object method6510(Buffer var1) {
		return this.field4133.vmethod6533(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lcf;",
		garbageValue = "268757704"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = Varcs.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = NetSocket.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lne;",
		garbageValue = "1422033008"
	)
	public static class375 method6511(Class var0) {
		class375[] var1 = new class375[]{field4128, field4134, field4127};
		class375[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class375 var4 = var2[var3];
			if (var4.field4132 == var0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnt;I)V",
		garbageValue = "-1820805265"
	)
	public static void method6512(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class375 var4 = method6511(var3);
		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class371 var2 = var4.field4133;
			var2.vmethod6536(var0, var1);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1726872314"
	)
	static final void method6530(String var0) {
		PacketBufferNode var1 = InterfaceParent.getPacketBufferNode(ClientPacket.field2665, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class44.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "784066620"
	)
	static int method6531(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class250.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var5 = class250.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				ChatChannel.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1];
				var5 = class250.ItemDefinition_get(var3);
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					var7 = class250.ItemDefinition_get(var3);
					if (var7.noteTemplate == -1 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					var7 = class250.ItemDefinition_get(var3);
					if (var7.noteTemplate >= 0 && var7.note >= 0) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					var7 = class250.ItemDefinition_get(var3);
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					var7 = class250.ItemDefinition_get(var3);
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var6 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
					DevicePcmPlayerProvider.findItemDefinitions(var6, var4 == 1);
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ApproximateRouteStrategy.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						PcmPlayer.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize];
						var4 = class250.ItemDefinition_get(var3).getShiftClickIndex();
						if (var4 == -1) {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4;
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4 + 1;
						}

						return 1;
					} else {
						return 2;
					}
				} else {
					if (ClanChannel.foundItemIds != null && PcmPlayer.foundItemIndex < ApproximateRouteStrategy.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ClanChannel.foundItemIds[++PcmPlayer.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-25477474"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			FriendSystem.method1875(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1213 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}
