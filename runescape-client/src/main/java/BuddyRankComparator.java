import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	static Archive field1380;
	@ObfuscatedName("o")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lnh;B)I",
		garbageValue = "-6"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "134944919"
	)
	static int method2690(int var0, Script var1, boolean var2) {
		if (var0 == 7100) { // L: 4607
			++TaskHandler.Interpreter_intStackSize; // L: 4608
			return 1; // L: 4609
		} else if (var0 == 7101) { // L: 4611
			GrandExchangeOfferAgeComparator.Interpreter_stringStackSize += 2; // L: 4612
			return 1; // L: 4613
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) { // L: 4615
			if (var0 == 7106) { // L: 4619
				++TaskHandler.Interpreter_intStackSize; // L: 4620
				return 1; // L: 4621
			} else if (var0 == 7107) { // L: 4623
				++TaskHandler.Interpreter_intStackSize; // L: 4624
				return 1; // L: 4625
			} else if (var0 == 7108) { // L: 4627
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class21.method303() ? 1 : 0; // L: 4628
				return 1; // L: 4629
			} else if (var0 == 7110) { // L: 4631
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4632
				return 1; // L: 4633
			} else if (var0 == 7120) { // L: 4635
				--TaskHandler.Interpreter_intStackSize; // L: 4636
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4637
				return 1; // L: 4638
			} else if (var0 == 7121) { // L: 4640
				TaskHandler.Interpreter_intStackSize -= 2; // L: 4641
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1; // L: 4642
				return 1; // L: 4643
			} else if (var0 == 7122) { // L: 4645
				TaskHandler.Interpreter_intStackSize -= 2; // L: 4646
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0; // L: 4647
				return 1; // L: 4648
			} else {
				return 2; // L: 4650
			}
		} else {
			++TaskHandler.Interpreter_intStackSize; // L: 4616
			return 1; // L: 4617
		}
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "144313696"
	)
	static void method2698() {
		if (Client.field701 && class28.localPlayer != null) { // L: 12398
			int var0 = class28.localPlayer.pathX[0]; // L: 12399
			int var1 = class28.localPlayer.pathY[0]; // L: 12400
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12401
				return;
			}

			ObjectSound.oculusOrbFocalPointX = class28.localPlayer.x; // L: 12402
			int var2 = SecureRandomFuture.getTileHeight(class28.localPlayer.x, class28.localPlayer.y, FriendSystem.Client_plane) - Client.camFollowHeight; // L: 12403
			if (var2 < FileSystem.field1753) { // L: 12404
				FileSystem.field1753 = var2;
			}

			class306.oculusOrbFocalPointY = class28.localPlayer.y; // L: 12405
			Client.field701 = false; // L: 12406
		}

	} // L: 12408
}
