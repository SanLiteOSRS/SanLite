import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mu")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1400406739
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1887252523
	)
	@Export("x")
	public int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1320399219
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1987499924"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane; // L: 31
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lmu;I)Z",
		garbageValue = "-636539751"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) { // L: 49
			return false;
		} else {
			return this.y == var1.y; // L: 50
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "963757583"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 42
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 43 44
		}
	}

	public String toString() {
		return this.toString(","); // L: 60
	}

	public int hashCode() {
		return this.packed(); // L: 56
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-49"
	)
	static int method6328(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) { // L: 4421
			UserComparator6.Interpreter_intStackSize -= 2; // L: 4422
			var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]; // L: 4423
			int var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]; // L: 4424
			if (!Client.isCameraLocked) { // L: 4425
				Client.camAngleX = var3; // L: 4426
				Client.camAngleY = var4; // L: 4427
			}

			return 1; // L: 4429
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) { // L: 4431
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.camAngleX; // L: 4432
			return 1; // L: 4433
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) { // L: 4435
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.camAngleY; // L: 4436
			return 1; // L: 4437
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) { // L: 4439
			var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4440
			if (var3 < 0) { // L: 4441
				var3 = 0;
			}

			Client.camFollowHeight = var3; // L: 4442
			return 1; // L: 4443
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) { // L: 4445
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.camFollowHeight; // L: 4446
			return 1; // L: 4447
		} else {
			return 2; // L: 4449
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1107071465"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) { // L: 3850
			Actor.method2488(0, 0); // L: 3851
		} else if (var0 != -1) { // L: 3853
			boolean var1;
			if (class319.field3466.isEmpty()) { // L: 3856
				var1 = false; // L: 3861
			} else {
				class331 var2 = (class331)class319.field3466.get(0); // L: 3857
				var1 = var2 != null && var0 == var2.field3573; // L: 3858
			}

			if (!var1 && class93.clientPreferences.method2597() != 0) { // L: 3863 3864
				ArrayList var3 = new ArrayList(); // L: 3865
				var3.add(new class331(WorldMapSection0.field2587, var0, 0, class93.clientPreferences.method2597(), false)); // L: 3866
				if (Client.playingJingle) { // L: 3867
					class319.field3466.clear(); // L: 3869
					class319.field3466.addAll(var3); // L: 3870
					WorldMapRectangle.method5019(0, 100, 100, 0); // L: 3871
				} else {
					LoginScreenAnimation.method2528(var3, 0, 100, 100, 0, false); // L: 3875
				}
			}
		}

	} // L: 3880

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-1042992560"
	)
	static final boolean method6334(Widget var0) {
		int var1 = var0.contentType; // L: 12298
		if (var1 == 205) { // L: 12299
			Client.logoutTimer = 250; // L: 12300
			return true; // L: 12301
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12303
				var2 = (var1 - 300) / 2; // L: 12304
				var3 = var1 & 1; // L: 12305
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12306
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12308
				var2 = (var1 - 314) / 2; // L: 12309
				var3 = var1 & 1; // L: 12310
				Client.playerAppearance.method6388(var2, var3 == 1); // L: 12311
			}

			if (var1 == 324) { // L: 12313
				Client.playerAppearance.method6386(0);
			}

			if (var1 == 325) { // L: 12314
				Client.playerAppearance.method6386(1);
			}

			if (var1 == 326) { // L: 12315
				PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3200, Client.packetWriter.isaacCipher); // L: 12317
				Client.playerAppearance.write(var4.packetBuffer); // L: 12318
				Client.packetWriter.addNode(var4); // L: 12319
				return true; // L: 12320
			} else {
				return false; // L: 12322
			}
		}
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-11"
	)
	static void method6339(String var0) {
		class426.field4608 = var0; // L: 12602

		try {
			String var1 = VertexNormal.client.getParameter(Integer.toString(18)); // L: 12604
			String var2 = VertexNormal.client.getParameter(Integer.toString(13)); // L: 12605
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12606
			if (var0.length() == 0) { // L: 12607
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + KitDefinition.method3654(UserComparator9.method2973() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12608
			}

			class26.method390(VertexNormal.client, "document.cookie=\"" + var3 + "\""); // L: 12609
		} catch (Throwable var4) { // L: 12611
		}

	} // L: 12612
}
