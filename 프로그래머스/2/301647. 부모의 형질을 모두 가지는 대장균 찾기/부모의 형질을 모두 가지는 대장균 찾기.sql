select c.id, c.genotype, p.genotype
from ecoli_data c
join ecoli_data p on c.parent_id = p.id
where (c.genotype & p.genotype) = p.genotype
ORDER BY c.id asc;
