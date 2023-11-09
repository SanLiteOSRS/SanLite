import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -113644749
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -96298701
	)
	@Export("x")
	public int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2105445199
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Llb;)V"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-964267539"
	)
	@Export("packed")
	public int packed() {
		return class282.method5681(this.plane, this.x, this.y); // L: 30
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Llb;I)Z",
		garbageValue = "1151983823"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 45
			return false;
		} else if (this.x != var1.x) { // L: 46
			return false;
		} else {
			return this.y == var1.y; // L: 47
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1584874808"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 61
	}

	public String toString() {
		return this.toString(","); // L: 57
	}

	public int hashCode() {
		return this.packed(); // L: 53
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 39
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 40 41
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-752126204"
	)
	static final void method6022() {
		if (GraphicsObject.FriendsChatManager_inFriendsChat) { // L: 3535
			if (UserComparator5.friendsChatManager != null) { // L: 3536
				UserComparator5.friendsChatManager.sort(); // L: 3537
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3540
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3541
				var1.clearIsInFriendsChat(); // L: 3542
			}

			GraphicsObject.FriendsChatManager_inFriendsChat = false; // L: 3545
		}

	} // L: 3547
}
