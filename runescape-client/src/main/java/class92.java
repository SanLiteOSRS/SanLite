import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
public class class92 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "575831891"
	)
	static int method2342(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1818
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1819
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1820
			return 1; // L: 1821
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1823
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1824
			if (var3.itemId != -1) { // L: 1825
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1826
			}

			return 1; // L: 1827
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1829
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1830
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1831
			if (var4 != null) { // L: 1832
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1833
			}

			return 1; // L: 1834
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1836
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1837
			return 1; // L: 1838
		} else if (var0 == 2707) { // L: 1840
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1841
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6359() ? 1 : 0; // L: 1842
			return 1; // L: 1843
		} else if (var0 == 2708) { // L: 1845
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1846
			return MenuAction.method2056(var3); // L: 1847
		} else if (var0 == 2709) { // L: 1849
			var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1850
			return class10.method103(var3); // L: 1851
		} else {
			return 2; // L: 1853
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1716509361"
	)
	static final void method2344(PacketBuffer var0) {
		var0.importIndex(); // L: 8707
		int var1 = var0.readBits(8); // L: 8708
		int var2;
		if (var1 < Client.npcCount) { // L: 8709
			for (var2 = var1; var2 < Client.npcCount; ++var2) { // L: 8710
				Client.field635[++Client.field634 - 1] = Client.npcIndices[var2];
			}
		}

		if (var1 > Client.npcCount) { // L: 8712
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8713

			for (var2 = 0; var2 < var1; ++var2) { // L: 8714
				int var3 = Client.npcIndices[var2]; // L: 8715
				NPC var4 = Client.npcs[var3]; // L: 8716
				int var5 = var0.readBits(1); // L: 8717
				if (var5 == 0) { // L: 8718
					Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8719
					var4.npcCycle = Client.cycle; // L: 8720
				} else {
					int var6 = var0.readBits(2); // L: 8723
					if (var6 == 0) { // L: 8724
						Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8725
						var4.npcCycle = Client.cycle; // L: 8726
						Client.field566[++Client.field579 - 1] = var3; // L: 8727
					} else {
						int var7;
						int var8;
						if (var6 == 1) { // L: 8730
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8731
							var4.npcCycle = Client.cycle; // L: 8732
							var7 = var0.readBits(3); // L: 8733
							var4.method2559(var7, class216.field2395); // L: 8734
							var8 = var0.readBits(1); // L: 8735
							if (var8 == 1) { // L: 8736
								Client.field566[++Client.field579 - 1] = var3;
							}
						} else if (var6 == 2) { // L: 8739
							Client.npcIndices[++Client.npcCount - 1] = var3; // L: 8740
							var4.npcCycle = Client.cycle; // L: 8741
							if (var0.readBits(1) == 1) { // L: 8742
								var7 = var0.readBits(3); // L: 8743
								var4.method2559(var7, class216.field2396); // L: 8744
								var8 = var0.readBits(3); // L: 8745
								var4.method2559(var8, class216.field2396); // L: 8746
							} else {
								var7 = var0.readBits(3); // L: 8749
								var4.method2559(var7, class216.field2394); // L: 8750
							}

							var7 = var0.readBits(1); // L: 8752
							if (var7 == 1) { // L: 8753
								Client.field566[++Client.field579 - 1] = var3;
							}
						} else if (var6 == 3) { // L: 8756
							Client.field635[++Client.field634 - 1] = var3; // L: 8757
						}
					}
				}
			}

		}
	} // L: 8761
}
