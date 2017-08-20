SELECT rs.num, SUM(value) FROM expenses, receivers rs WHERE receiver=rs.num GROUP BY name;
